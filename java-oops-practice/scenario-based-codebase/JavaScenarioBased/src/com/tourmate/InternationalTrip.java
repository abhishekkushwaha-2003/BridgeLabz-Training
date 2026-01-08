package com.tourmate;

//International trip implementation
public class InternationalTrip extends Trip {

 public InternationalTrip(String destination, int duration,
                          Transport transport, Hotel hotel, Activity activity) {
     super(destination, duration, transport, hotel, activity);
 }

 @Override
 public void book() {
     System.out.println("International trip to " + destination + " booked");
     System.out.println("Visa & passport verification completed");
     transport.book();
     hotel.book();
     activity.book();
 }

 @Override
 public void cancel() {
     System.out.println("International trip cancelled");
 }
}
