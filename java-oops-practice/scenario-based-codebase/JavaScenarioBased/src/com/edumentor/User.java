package com.edumentor;

//base user class

public class User {
	protected String name;
	protected String emailId;
	protected int userId;
	
	public User(String name, String emailId, int userId) {
		this.name = name;
		this.emailId = emailId;
		this.userId = userId;
	}
	
	public void displayUser() {
        System.out.println("Name: " + name + ", Email: " + emailId + ", ID: " + userId);
    }
}
