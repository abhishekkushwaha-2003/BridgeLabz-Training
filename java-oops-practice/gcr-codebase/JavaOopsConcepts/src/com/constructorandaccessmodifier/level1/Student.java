package com.constructorandaccessmodifier.level1;

// Student class
// this class shows the use of access modifier
public class Student {

	    // public variable - can be accessed from anywhere
	    public int rollNumber;

	    // protected variable - can be accessed in same package and subclasses
	    protected String name;

	    // private variable - can be accessed only inside this class
	    private double cgpa;

	    // constructor to initialize student details
	    Student(int rollNumber, String name, double cgpa) {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.cgpa = cgpa;
	    }

	    // public method to get CGPA
	   
	    public double getCGPA() {
	        return cgpa;
	    }

	    // public method to update CGPA
	   
	    public void setCGPA(double cgpa) {
	        this.cgpa = cgpa;
	    }

	    // method to display basic student details
	    void displayStudent() {
	        System.out.println("Roll Number : " + rollNumber);
	        System.out.println("Name        : " + name);
	        System.out.println("CGPA        : " + cgpa);
	    }
	}
