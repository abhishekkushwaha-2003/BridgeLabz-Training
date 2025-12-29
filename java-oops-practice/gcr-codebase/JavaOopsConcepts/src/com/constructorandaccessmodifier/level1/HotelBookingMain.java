package com.constructorandaccessmodifier.level1;

// HotelBookingSystemMain class
public class HotelBookingMain {

	// this class contains the main method

	    public static void main(String[] args) {

	        // using default constructor
	    	HotelBooking booking1 = new HotelBooking();
	        System.out.println("Booking 1:");
	        booking1.displayBooking();

	        // using parameterized constructor
	        HotelBooking booking2 = new HotelBooking("Rahul", "Deluxe", 3);
	        System.out.println("\nBooking 2:");
	        booking2.displayBooking();

	        // using copy constructor
	        HotelBooking booking3 = new HotelBooking(booking2);
	        System.out.println("\nBooking 3 (Copy of Booking 2):");
	        booking3.displayBooking();
	    }
	}

