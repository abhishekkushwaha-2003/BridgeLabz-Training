package com.inheritance.hierarchicalinheritance;

//Subclass Teacher
class Teacher extends Person {

	// unique attribute
	String subject;

	Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	// displaying role
	void displayRole() {
		System.out.println("Role: Teacher");
		System.out.println("Subject: " + subject);
	}
}

