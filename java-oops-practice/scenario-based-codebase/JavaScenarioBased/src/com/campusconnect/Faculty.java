package com.campusconnect;

//faculty class
class Faculty extends Person {

	private String subject;

	// constructor
	Faculty(int id, String name, String email, String subject) {
		super(id, name, email);
		this.subject = subject;
	}

	// overridden method
	void printDetails() {
		System.out.println("Faculty ID: " + id);
		System.out.println("Faculty Name: " + name);
		System.out.println("Subject: " + subject);
	}
}

