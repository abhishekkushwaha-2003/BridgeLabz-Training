package com.constructorandaccessmodifier.level1;

// Vehicle class
// this class is used to store vehicle registration details
public class Vehicle {

	    // instance variables
	    String ownerName;
	    String vehicleType;

	    // class variable 
	    static double registrationFee = 1500;

	    // constructor to initialize vehicle details
	    Vehicle(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    // instance method
	    // used to display individual vehicle details
	    void displayVehicleDetails() {
	        System.out.println("Owner Name        : " + ownerName);
	        System.out.println("Vehicle Type      : " + vehicleType);
	        System.out.println("Registration Fee  : Rs. " + registrationFee);
	    }

	    // class method
	    // used to update registration fee for all vehicles
	    static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }
	}

