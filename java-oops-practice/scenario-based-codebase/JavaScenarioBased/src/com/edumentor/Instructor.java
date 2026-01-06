package com.edumentor;

public class Instructor extends User {
	public Instructor(String name, String emailId, int userId) {
		super(name, emailId, userId);
	}
	
	 public void createQuiz() {
		 System.out.println("Instructor is creating a quiz...");
	  }
}
