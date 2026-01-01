package com.inheritance.assistedproblems;

//Subclass Developer
class Developer extends Employee {

	// unique attribute
	String programmingLanguage;

	Developer(String name, int id, double salary, String programmingLanguage) {
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}

	// overriding displayDetails()
	void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language: " + programmingLanguage);
	}
}

