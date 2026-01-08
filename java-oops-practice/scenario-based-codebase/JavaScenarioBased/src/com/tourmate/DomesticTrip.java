package com.tourmate;

//Domestic trip implementation
public class DomesticTrip extends Trip {

 public DomesticTrip(String destination, int duration,
                     Transport transport, Hotel hotel, Activity activity) {
     super(destination, duration, transport, hotel, activity);
 }

 @Override
 public void book() {
     System.out.println("Domestic trip to " + destination + " booked");
     transport.book();
     hotel.book();
     activity.book();
 }

 @Override
 public void cancel() {
     System.out.println("Domestic trip cancelled");
 }
}
