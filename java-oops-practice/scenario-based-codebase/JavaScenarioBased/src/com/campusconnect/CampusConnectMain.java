package com.campusconnect;

public class CampusConnectMain {

	public static void main(String[] args) {

		// creating faculty
		Faculty f1 = new Faculty(1, "Dr. Sharma", "sharma@college.com", "Java");

		// creating course
		Course javaCourse = new Course("Core Java", f1);

		// creating students
		Student s1 = new Student(101, "Rahul", "rahul@gmail.com");
		Student s2 = new Student(102, "Ajay", "ajay@gmail.com");

		// enrolling students
		s1.enrollCourse(javaCourse);
		s2.enrollCourse(javaCourse);

		System.out.println();

		// adding marks
		s1.addMarks(80);
		s1.addMarks(70);

		s2.addMarks(90);
		s2.addMarks(85);

		System.out.println();

		// polymorphism
		Person p1 = s1;
		Person p2 = f1;

		p1.printDetails();
		System.out.println();
		p2.printDetails();

		System.out.println();

		// show course info
		javaCourse.showCourseDetails();
	}
}
