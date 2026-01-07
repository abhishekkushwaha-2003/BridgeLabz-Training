package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketMain {

    public static void main(String[] args) {

        // create ticket system object
        TicketReservationSystem system = new TicketReservationSystem();

        // adding tickets
        system.addTicket(101, "Rahul", "Avengers", "A1", "10:00 AM");
        system.addTicket(102, "Anita", "Inception", "B5", "11:30 AM");
        system.addTicket(103, "Rahul", "Avengers", "C3", "01:00 PM");

        // display all tickets
        system.displayTickets();

        // search ticket by customer name
        system.searchTicket("Rahul");

        // remove a ticket
        system.removeTicket(102);

        // display after removal
        system.displayTickets();

        // total booked tickets
        System.out.println("Total Tickets: " + system.countTickets());
    }
}
