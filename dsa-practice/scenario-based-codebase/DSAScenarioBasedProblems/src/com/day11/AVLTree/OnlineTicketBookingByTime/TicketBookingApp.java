package com.day11.AVLTree.OnlineTicketBookingByTime;

//Main class

public class TicketBookingApp {

 public static void main(String[] args) {

     EventBST bookingSystem = new EventBST();

     // add events
     bookingSystem.addEvent(201, 1800);
     bookingSystem.addEvent(202, 1400);
     bookingSystem.addEvent(203, 2000);
     bookingSystem.addEvent(204, 1600);

     System.out.println("Upcoming Events:");
     bookingSystem.showEventsInOrder();

     // cancel event
     System.out.println("\nAfter cancelling event :");
     bookingSystem.cancelEvent(1600);
     bookingSystem.showEventsInOrder();
 }
}
