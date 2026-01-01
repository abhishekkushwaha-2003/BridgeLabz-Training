package com.inheritance.assistedproblems;

//Base class
class Employee {

	// common attributes
	String name;
	int id;
	double salary;

	// constructor
	Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// method to display employee details
	void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Salary: " + salary);
	}
}
