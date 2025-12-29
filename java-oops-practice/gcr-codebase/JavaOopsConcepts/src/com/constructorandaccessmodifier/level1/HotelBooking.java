package com.constructorandaccessmodifier.level1;

public class HotelBooking {
	
	    String guestName;
	    String roomType;
	    int nights;
	    double totalAmount;

	    // default constructor
	    // this constructor is called when no values are passed
	    HotelBooking() {
	        guestName = "Guest";
	        roomType = "Standard";
	        nights = 1;
	        totalAmount = calculateAmount();
	    }

	    // parameterized constructor
	    // this constructor is used to pass values at the time of object creation
	    HotelBooking(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	        totalAmount = calculateAmount();
	    }

	    // copy constructor
	    // this constructor copies data from another object
	    HotelBooking(HotelBooking oldBooking) {
	        guestName = oldBooking.guestName;
	        roomType = oldBooking.roomType;
	        nights = oldBooking.nights;
	        totalAmount = oldBooking.totalAmount;
	    }

	    // method to calculate total booking amount
	    double calculateAmount() {
	        double pricePerNight;

	        if (roomType.equalsIgnoreCase("Deluxe")) {
	            pricePerNight = 3000;
	        } else if (roomType.equalsIgnoreCase("Suite")) {
	            pricePerNight = 5000;
	        } else {
	            pricePerNight = 2000;
	        }

	        return pricePerNight * nights;
	    }

	    // method to display booking details
	    void displayBooking() {
	        System.out.println("Guest Name : " + guestName);
	        System.out.println("Room Type  : " + roomType);
	        System.out.println("Nights     : " + nights);
	        System.out.println("Total Bill : Rs. " + totalAmount);
	    }
	}

