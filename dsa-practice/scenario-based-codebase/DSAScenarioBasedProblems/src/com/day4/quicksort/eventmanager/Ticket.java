package com.day4.quicksort.eventmanager;

// create a class Ticket 
public class Ticket {
	int ticketId;
	double price;
	
	public Ticket(int ticketId, double price){
		this.ticketId=ticketId;
		this.price=price;
	}
	// create a method+[;,m'  diplay 
	public void display() {
		System.out.println("Ticket ID : "+ticketId+" Price : "+price);
	}

}
