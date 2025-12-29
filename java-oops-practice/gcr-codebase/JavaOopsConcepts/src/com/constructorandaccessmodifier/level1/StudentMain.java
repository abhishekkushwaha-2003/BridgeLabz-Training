package com.constructorandaccessmodifier.level1;

// StudentMain class
// this class contains the main method
public class StudentMain {

	    public static void main(String[] args) {

	        // creating Student object
	        Student s1 = new Student(101, "Amit", 8.2);

	        System.out.println("Student Details:");
	        s1.displayStudent();

	        // accessing public variable
	        System.out.println("\nAccessing Public Variable:");
	        System.out.println("Roll Number: " + s1.rollNumber);

	        // modifying private variable using public method
	        s1.setCGPA(8.6);

	        System.out.println("\nStudent Details After CGPA Update:");
	        s1.displayStudent();

	        // creating PostgraduateStudent object
	        PostgraduateStudent pg1 =
	                new PostgraduateStudent(201, "Rohit", 8.8, "Computer Science");

	        System.out.println("\nPostgraduate Student Details:");
	        pg1.displayPGStudent();
	    }
	}

