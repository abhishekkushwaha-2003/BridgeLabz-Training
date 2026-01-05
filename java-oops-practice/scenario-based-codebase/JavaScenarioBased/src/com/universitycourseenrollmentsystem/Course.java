package com.universitycourseenrollmentsystem;

//course class
class Course {

	private int courseId;
	private String courseName;
	private int credits;

	// constructor
	Course(int id, String name, int credits) {
		this.courseId = id;
		this.courseName = name;
		this.credits = credits;
	}

	void displayCourse() {
		System.out.println("Course ID: " + courseId);
		System.out.println("Course Name: " + courseName);
		System.out.println("Credits: " + credits);
	}
}
