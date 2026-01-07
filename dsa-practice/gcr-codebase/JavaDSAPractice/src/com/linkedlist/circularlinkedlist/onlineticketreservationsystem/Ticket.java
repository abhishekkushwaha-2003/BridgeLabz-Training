package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

//Node class representing one booked ticket
class Ticket {

 int ticketId;
 String customerName;
 String movieName;
 String seatNumber;
 String bookingTime;

 Ticket next;   // pointer for circular linked list

 // constructor to initialize ticket
 Ticket(int ticketId, String customerName, String movieName,
        String seatNumber, String bookingTime) {

     this.ticketId = ticketId;
     this.customerName = customerName;
     this.movieName = movieName;
     this.seatNumber = seatNumber;
     this.bookingTime = bookingTime;
     this.next = null;
 }
}

