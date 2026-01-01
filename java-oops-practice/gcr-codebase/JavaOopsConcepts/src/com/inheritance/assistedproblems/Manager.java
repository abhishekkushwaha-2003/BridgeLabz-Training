package com.inheritance.assistedproblems;

//Subclass Manager
class Manager extends Employee {

	// unique attribute
	int teamSize;

	Manager(String name, int id, double salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}

	// overriding displayDetails()
	void displayDetails() {
		super.displayDetails();
		System.out.println("Team Size: " + teamSize);
	}
}

