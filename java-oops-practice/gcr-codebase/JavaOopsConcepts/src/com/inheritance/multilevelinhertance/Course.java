package com.inheritance.multilevelinhertance;

//Base class
class Course {

	// common attributes
	String courseName;
	int duration;   // in hours

	// constructor
	Course(String courseName, int duration) {
		this.courseName = courseName;
		this.duration = duration;
	}

	// method to display course details
	void displayCourse() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration + " hours");
	}
}
