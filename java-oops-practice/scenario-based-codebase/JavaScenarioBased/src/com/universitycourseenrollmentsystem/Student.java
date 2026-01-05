package com.universitycourseenrollmentsystem;

//parent student class
abstract class Student {

	// private data
	private int studentId;
	private String name;
	private double gpa;

	// constructor
	Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	// getter for gpa
	double getGpa() {
		return gpa;
	}

	// setter for gpa
	void setGpa(double gpa) {
		this.gpa = gpa;
	}

	// common method
	void showTranscript() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);
	}

	// abstract method
	abstract void displayStudentType();
}
