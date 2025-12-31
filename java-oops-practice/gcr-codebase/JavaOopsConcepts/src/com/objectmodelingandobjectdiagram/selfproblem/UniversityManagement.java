package com.objectmodelingandobjectdiagram.selfproblem;

public class UniversityManagement {

	    public static void main(String[] args) {

	        // creating professors
	        Professor p1 = new Professor("Dr. Sharma");
	        Professor p2 = new Professor("Dr. Mehta");

	        // creating courses
	        CourseDetail c1 = new CourseDetail("Computer Science");
	        CourseDetail c2 = new CourseDetail("Mathematics");

	        // assigning professors to courses
	        c1.assignProfessor(p1);
	        c2.assignProfessor(p2);

	        // creating students
	        StudentDetail s1 = new StudentDetail("Rohan");
	        StudentDetail s2 = new StudentDetail("Neha");

	        // students enrolling in courses
	        s1.enrollCourse(c1);
	        s1.enrollCourse(c2);

	        s2.enrollCourse(c1);

	        // viewing details
	        System.out.println();
	        s1.viewCourses();

	        System.out.println();
	        c1.showCourse();
	    }
	}

