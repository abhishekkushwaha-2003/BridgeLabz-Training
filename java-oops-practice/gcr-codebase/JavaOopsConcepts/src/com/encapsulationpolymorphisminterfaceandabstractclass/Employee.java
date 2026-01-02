package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract class Employee
abstract class Employee {

	// private fields (encapsulation)
	private int employeeId;
	private String name;
	private double baseSalary;

	// department name
	String department;

	// constructor
	Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// getters and setters
	int getEmployeeId() {
		return employeeId;
	}

	String getName() {
		return name;
	}

	double getBaseSalary() {
		return baseSalary;
	}

	void setBaseSalary(double baseSalary) {
		if (baseSalary > 0) {
			this.baseSalary = baseSalary;
		}
	}

	// abstract method
	abstract double calculateSalary();

	// concrete method
	void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + calculateSalary());
		System.out.println();
	}
}

