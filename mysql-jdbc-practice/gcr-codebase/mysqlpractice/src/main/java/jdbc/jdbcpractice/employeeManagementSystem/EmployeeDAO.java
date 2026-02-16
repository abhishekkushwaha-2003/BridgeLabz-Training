package jdbc.jdbcpractice.employeeManagementSystem;

import jdbc.jdbcpractice.util.DBConnection;
import java.sql.*;

public class EmployeeDAO {

    public void addEmployee(Employee emp) throws SQLException {
        String sql = "INSERT INTO employee(empName, empSalary) VALUES (?, ?)";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, emp.getName());
        ps.setDouble(2, emp.getSalary());

        ps.executeUpdate();
        System.out.println("Employee added successfully");
        con.close();
    }

    public void viewEmployees() throws SQLException {
        String sql = "SELECT * FROM employee";

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);

        while (rs.next()) {
            System.out.println(
                rs.getInt("empID") + " | " +
                rs.getString("empName") + " | " +
                rs.getDouble("empSalary")
            );
        }
        con.close();
    }

    public void updateSalary(int empID, double empSalary) throws SQLException {
        String sql = "UPDATE employee SET empSalary=? WHERE empID=?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setDouble(1, empSalary);
        ps.setInt(2, empID);

        ps.executeUpdate();
        System.out.println("Salary updated");
        con.close();
    }

    public void deleteEmployee(int empID) throws SQLException {
        String sql = "DELETE FROM employee WHERE empID=?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, empID);
        ps.executeUpdate();
        System.out.println("Employee deleted");
        con.close();
    }

    public void searchByName(String empName) throws SQLException {
        String sql = "SELECT * FROM employee WHERE empName LIKE ?";

        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "%" + empName + "%");
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            System.out.println(
                rs.getInt("empID") + " | " +
                rs.getString("empName") + " | " +
                rs.getDouble("empSalary")
            );
        }
        con.close();
    }
}