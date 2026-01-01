package com.inheritance.multilevelinhertance;

public class CourseMain {
		public static void main(String[] args) {

			Course c1 = new Course("C Programming", 40);

			Course c2 = new OnlineCourse(
				"Java Basics", 50, "Udemy", true
			);

			Course c3 = new PaidOnlineCourse(
				"Advanced Java", 60, "Coursera", true, 5000, 10
			);

			c1.displayCourse();
			System.out.println();

			c2.displayCourse();
			System.out.println();

			c3.displayCourse();
		}
	}

