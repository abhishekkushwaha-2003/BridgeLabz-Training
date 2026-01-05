package com.campusconnect;

import java.util.ArrayList;

//course class
class Course {

	String courseName;
	Faculty faculty;

	// list of students
	ArrayList<Student> students = new ArrayList<>();

	// constructor
	Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
	}

	// add student
	void addStudent(Student student) {
		students.add(student);
	}

	// show course details
	void showCourseDetails() {
		System.out.println("Course: " + courseName);
		System.out.println("Faculty: " + faculty.name);
		System.out.println("Enrolled Students:");
		for (Student s : students) {
			System.out.println("- " + s.name);
		}
	}
}
