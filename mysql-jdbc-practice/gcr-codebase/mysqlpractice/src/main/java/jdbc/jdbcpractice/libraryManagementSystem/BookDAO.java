package jdbc.jdbcpractice.libraryManagementSystem;

import jdbc.jdbcpractice.util.DBConnectionLibrary;
import java.sql.*;

public class BookDAO {

    public void searchByName(String name) throws Exception {

        String sql = "SELECT * FROM book WHERE bookName = ?";

        try (Connection con = DBConnectionLibrary.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getInt("bookID") + " | " +
                        rs.getString("bookName") + " | " +
                        rs.getString("category") + " | Available: " +
                        rs.getInt("available"));
            }
        }
    }

    public void searchByCategory(String category) throws Exception {

        String sql = "SELECT * FROM book WHERE category = ?";

        try (Connection con = DBConnectionLibrary.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, category);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getInt("bookID") + " | " +
                        rs.getString("bookName") + " | " +
                        rs.getString("category") + " | Available: " +
                        rs.getInt("available"));
            }
        }
    }
}
