package jdbc.jdbcpractice.libraryManagementSystem;

import jdbc.jdbcpractice.util.DBConnectionLibrary;
import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowDAO {

    public void issueBook(int studentID, int bookID) throws Exception {

        Connection con = DBConnectionLibrary.getConnection();
        con.setAutoCommit(false);

        try {

            // Decrease available count
            PreparedStatement ps1 = con.prepareStatement(
                    "UPDATE book SET available = available - 1 WHERE bookID=? AND available > 0");
            ps1.setInt(1, bookID);

            if (ps1.executeUpdate() == 0)
                throw new RuntimeException("Book not available");

            // Insert into issue table
            PreparedStatement ps2 = con.prepareStatement(
                    "INSERT INTO issue(studentID, bookID, issueDate) VALUES(?,?,CURDATE())");

            ps2.setInt(1, studentID);
            ps2.setInt(2, bookID);
            ps2.executeUpdate();

            con.commit();
            System.out.println("Book issued successfully");

        } catch (Exception e) {
            con.rollback();
            throw e;
        } finally {
            con.close();
        }
    }

    public void returnBook(int issueID) throws Exception {

        Connection con = DBConnectionLibrary.getConnection();
        con.setAutoCommit(false);

        PreparedStatement ps = con.prepareStatement(
                "SELECT bookID, issueDate FROM issue WHERE issueID=?");

        ps.setInt(1, issueID);
        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            System.out.println("Invalid issue ID");
            return;
        }

        int bookID = rs.getInt(1);
        LocalDate issueDate = rs.getDate(2).toLocalDate();

        long days = ChronoUnit.DAYS.between(issueDate, LocalDate.now());
        long fine = days > 7 ? (days - 7) * 10 : 0;

        PreparedStatement ps2 = con.prepareStatement(
                "UPDATE issue SET returnDate = CURDATE() WHERE issueID=?");
        ps2.setInt(1, issueID);
        ps2.executeUpdate();

        PreparedStatement ps3 = con.prepareStatement(
                "UPDATE book SET available = available + 1 WHERE bookID=?");
        ps3.setInt(1, bookID);
        ps3.executeUpdate();

        con.commit();
        System.out.println("Returned successfully. Fine = ₹" + fine);
    }
}
