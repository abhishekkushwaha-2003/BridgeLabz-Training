package com.constructorandaccessmodifier.level1;

public class CarRentalMain {

	// CarRentalSystemMain class
	// this class contains the main method

	    public static void main(String[] args) {

	        // using default constructor
	    	CarRental rental1 = new CarRental();
	        System.out.println("Rental 1:");
	        rental1.displayRentalDetails();

	        // using parameterized constructor
	        CarRental rental2 = new CarRental("Abhishek", "SUV", 5);
	        System.out.println("\nRental 2:");
	        rental2.displayRentalDetails();
	    }
	}

