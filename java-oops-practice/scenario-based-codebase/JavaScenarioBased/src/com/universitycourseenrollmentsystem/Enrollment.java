package com.universitycourseenrollmentsystem;

//enrollment class
class Enrollment implements Graded {

	private Student student;
	private Course course;
	private double marks;

	// constructor
	Enrollment(Student student, Course course, double marks) {
		this.student = student;
		this.course = course;
		this.marks = marks;
	}

	// helper method to calculate gpa
	double calculateGpa() {
		return marks / 25; // simple logic
	}

	// interface method
	public void assignGrade() {

		double gpa = calculateGpa();
		student.setGpa(gpa*2.5);
		

		if (gpa >= 2.0) {
			System.out.println("Result: Pass");
		} else {
			System.out.println("Result: Fail");
		}
	}
}
