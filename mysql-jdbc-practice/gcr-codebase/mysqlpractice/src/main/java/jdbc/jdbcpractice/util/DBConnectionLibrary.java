package jdbc.jdbcpractice.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionLibrary {

    private static final String URL = "jdbc:mysql://localhost:3306/libraryDB";
    private static final String USER = "root";
    private static final String PASSWORD = "Abhishek@2003";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
