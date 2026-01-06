package com.eventease;

//base event class
class Event implements ISchedulable {

 private final int eventId; // cannot be changed
 protected String eventName;
 protected String location;
 protected String date;
 protected int attendees;

 private double price; // encapsulated

 Event(int eventId, String eventName, String location, String date, int attendees) {
     this.eventId = eventId;
     this.eventName = eventName;
     this.location = location;
     this.date = date;
     this.attendees = attendees;
     this.price = 0;
 }

 protected void calculatePrice(double venueCost, double serviceCost, double discount) {
     price = venueCost + serviceCost - discount;
 }

 public void showPrice() {
     System.out.println("Total Cost: " + price);
 }

 public void schedule() {
     System.out.println("Event scheduled on " + date);
 }

 public void reschedule(String newDate) {
     this.date = newDate;
     System.out.println("Event rescheduled to " + newDate);
 }

 public void cancel() {
     System.out.println("Event cancelled");
 }
}
