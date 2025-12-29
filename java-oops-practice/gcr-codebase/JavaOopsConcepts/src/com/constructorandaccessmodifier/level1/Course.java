package com.constructorandaccessmodifier.level1;

// Course class
// this class stores details of an online course
public class Course {
	

	    // instance variables
	    String courseName;
	    int duration;       
	    double fee;

	    // class variables 
	    static String instituteName = "ABC Institute";

	    // constructor to initialize course details
	    Course(String courseName, int duration, double fee) {
	        this.courseName = courseName;
	        this.duration = duration;
	        this.fee = fee;
	    }

	    // instance method
	    // used to display individual course details
	    void displayCourseDetails() {
	        System.out.println("Course Name    : " + courseName);
	        System.out.println("Duration       : " + duration + " months");
	        System.out.println("Course Fee     : Rs. " + fee);
	        System.out.println("Institute Name : " + instituteName);
	    }

	    // class method
	    // used to update institute name for all courses
	    static void updateInstituteName(String newInstituteName) {
	        instituteName = newInstituteName;
	    }
	}


