package com.inheritance.hierarchicalinheritance;

//Subclass Student
class Student extends Person {

	// unique attribute
	String grade;

	Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

	// displaying role
	void displayRole() {
		System.out.println("Role: Student");
		System.out.println("Grade: " + grade);
	}
}
