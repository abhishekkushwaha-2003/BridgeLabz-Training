package com.tourmate;

public class TourMateApp {
    // main method
    public static void main(String[] args) {
    	
    	// create an object for Transport class 
        Transport flight = new Transport("Flight", 10000);
        
    	// create an object for Hotel class 
        Hotel hotel = new Hotel("Sea View", 15000);
        
    	// create an object for Activity class 
        Activity activity = new Activity("Scuba Diving", 8000);

    	// creating trip package
        Trip trip = new InternationalTrip(
                "Maldives",
                5,
                flight,
                hotel,
                activity
        );
        
        // calling trip method 
        trip.book();
        
        // displaying total budget
        System.out.println("Total Budget: " + trip.getTotalBudget());
    }
}
