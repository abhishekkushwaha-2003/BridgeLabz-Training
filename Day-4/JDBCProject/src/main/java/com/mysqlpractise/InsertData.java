package com.mysqlpractise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
	public static void insertStudent(String name, String email, int age, String grade) {
		String sql = "INSERT INTO students (name, email, age, grade, enrollment_date) VALUES (?, ?, ?, ?, ?)";
		try (Connection conn = DBConnection.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setInt(3, age);
			pstmt.setString(4, grade);
			pstmt.setDate(5, new java.sql.Date(System.currentTimeMillis()));
			int rowsAffected = pstmt.executeUpdate();
			System.out.println(rowsAffected + " row(s) inserted successfully!");
		} catch (SQLException e) {
			System.err.println("Insert failed: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
//		  insertStudent("Abhishek", "abhishek@gmail.com", 20, "A");
//	      insertStudent("Rashi", "rashi@email.com", 22, "B");
//		  insertStudent("Rashi", "rashi@email.com", 22, "B");
//		  insertStudent("Anu", "anu@email.com", 24, "C");		
//		 insertStudent("Joe", "joe@email.com", 25, "B+");
		
		 insertStudent("Smith", "smith@email.com", 27, "C+");

	}
}
