package com.campusconnect;

import java.util.ArrayList;

//student class
class Student extends Person implements ICourseActions {

	// grades should be private (encapsulation)
	private double totalMarks;
	private int subjectCount;

	// list of courses
	ArrayList<Course> courses = new ArrayList<>();

	// constructor
	Student(int id, String name, String email) {
		super(id, name, email);
	}

	// enroll course
	public void enrollCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
		System.out.println(name + " enrolled in " + course.courseName);
	}

	// drop course
	public void dropCourse(Course course) {
		courses.remove(course);
		System.out.println(name + " dropped " + course.courseName);
	}

	// add marks
	void addMarks(double marks) {
		totalMarks = totalMarks + marks;
		subjectCount++;
	}

	// calculate GPA (out of 10)
	double calculateGPA() {
		if (subjectCount == 0)
			return 0;
		return (totalMarks / subjectCount) / 10;
	}

	// overridden method
	void printDetails() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("GPA: " + calculateGPA());
	}
}
