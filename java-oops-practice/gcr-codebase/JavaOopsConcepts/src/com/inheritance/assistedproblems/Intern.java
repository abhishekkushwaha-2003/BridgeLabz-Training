package com.inheritance.assistedproblems;

//Subclass Intern
class Intern extends Employee {

	// unique attribute
	int internshipDuration; // in months

	Intern(String name, int id, double salary, int internshipDuration) {
		super(name, id, salary);
		this.internshipDuration = internshipDuration;
	}

	// overriding displayDetails()
	void displayDetails() {
		super.displayDetails();
		System.out.println("Internship Duration: " + internshipDuration + " months");
	}
}
