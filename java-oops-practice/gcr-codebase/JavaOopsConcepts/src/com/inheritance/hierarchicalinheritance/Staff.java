package com.inheritance.hierarchicalinheritance;

//Subclass Staff
class Staff extends Person {

	// unique attribute
	String department;

	Staff(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}

	// displaying role
	void displayRole() {
		System.out.println("Role: Staff");
		System.out.println("Department: " + department);
	}
}

