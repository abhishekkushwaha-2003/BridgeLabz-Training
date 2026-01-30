package com.CSVDataHandling.AdvanceProblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GenerateCSVReportfromDatabase {

    public static void main(String[] args) {

       
        String url = "jdbc:mysql://localhost:3306/csvdb";
        String user = "root";
        String password = "root";

        try {
       
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT id, name, department, salary FROM employee"
            );

            BufferedWriter bw =
                new BufferedWriter(new FileWriter("output/employeesFromdb.csv"));

          
            bw.write("EmployeeID,Name,Department,Salary");
            bw.newLine();

            while (rs.next()) {
                bw.write(
                    rs.getInt("id") + "," +
                    rs.getString("name") + "," +
                    rs.getString("department") + "," +
                    rs.getInt("salary")
                );
                bw.newLine();
            }

            bw.close();
            rs.close();
            stmt.close();
            con.close();

            System.out.println("CSV file generated successfully from database!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
