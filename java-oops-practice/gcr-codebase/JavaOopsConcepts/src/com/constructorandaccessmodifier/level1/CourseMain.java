package com.constructorandaccessmodifier.level1;

// CourseMain class
// this class contains the main method
public class CourseMain {


	    public static void main(String[] args) {

	        // creating course objects
	        Course c1 = new Course("Java Programming", 6, 12000);
	        Course c2 = new Course("Web Development", 4, 10000);

	        // displaying course details before update
	        System.out.println("Course Details Before Institute Update:\n");
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();

	        // updating institute name using class method
	        Course.updateInstituteName("XYZ Online Academy");

	        // displaying course details after update
	        System.out.println("\nCourse Details After Institute Update:\n");
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();
	    }
	}

