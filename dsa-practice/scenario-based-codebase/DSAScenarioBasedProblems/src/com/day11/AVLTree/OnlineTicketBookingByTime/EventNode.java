package com.day11.AVLTree.OnlineTicketBookingByTime;

//class create a class to  represents one event in the system

public class EventNode {

// unique id for event
 int eventId;       
 int startTime;      

 EventNode left;     
 EventNode right;   

 // constructor
 public EventNode(int eventId, int startTime) {
     this.eventId = eventId;
     this.startTime = startTime;
     this.left = null;
     this.right = null;
 }
}
