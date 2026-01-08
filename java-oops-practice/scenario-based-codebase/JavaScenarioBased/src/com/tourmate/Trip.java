package com.tourmate;

//Base class representing a trip
public abstract class Trip implements IBookable {

 protected String destination;
 protected int duration;
 protected double totalBudget;

 protected Transport transport;
 protected Hotel hotel;
 protected Activity activity;

 // Constructor to create a complete trip package
 public Trip(String destination, int duration,
             Transport transport, Hotel hotel, Activity activity) {

     this.destination = destination;
     this.duration = duration;
     this.transport = transport;
     this.hotel = hotel;
     this.activity = activity;

     // Calculate total budget using operators
     this.totalBudget = transport.getCost()
                      + hotel.getCost()
                      + activity.getCost();
 }

 public double getTotalBudget() {
     return totalBudget;
 }
}
