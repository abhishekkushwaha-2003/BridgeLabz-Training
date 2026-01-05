package com.universitycourseenrollmentsystem;

public class UniversityMain {

	public static void main(String[] args) {

		// creating students
		Student s1 = new Undergraduate(101, "Amit");
		Student s2 = new Postgraduate(102, "Rajeev");

		// creating course
		Course c1 = new Course(1, "Data Structures", 4);

		// creating faculty
		Faculty f1 = new Faculty("Dr. Sharma");

		// displaying details
		f1.displayFaculty();
		c1.displayCourse();

		System.out.println("----------------");

		// enrollment and grading
		Enrollment e1 = new Enrollment(s1, c1, 70);
		Enrollment e2 = new Enrollment(s2, c1, 55);

		// polymorphism in grading
		e1.assignGrade();
		s1.displayStudentType();
		s1.showTranscript();

		System.out.println("----------------");

		e2.assignGrade();
		s2.displayStudentType();
		s2.showTranscript();
	}
}

