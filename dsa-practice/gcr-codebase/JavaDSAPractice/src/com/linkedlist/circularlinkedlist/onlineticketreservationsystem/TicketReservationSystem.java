package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketReservationSystem {

    private Ticket head = null;   // first ticket

    // add ticket at end of circular list
    void addTicket(int id, String customer, String movie,
                   String seat, String time) {

        Ticket newTicket = new Ticket(id, customer, movie, seat, time);

        // if list is empty
        if (head == null) {
            head = newTicket;
            newTicket.next = head;
            return;
        }

        // move to last ticket
        Ticket temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newTicket;
        newTicket.next = head;
    }

    // remove ticket by ticketId
    void removeTicket(int id) {

        if (head == null) {
            System.out.println("No tickets to remove");
            return;
        }

        Ticket temp = head;
        Ticket prev = null;

        do {
            if (temp.ticketId == id) {

                // only one ticket
                if (temp == head && temp.next == head) {
                    head = null;
                }
                // removing first ticket
                else if (temp == head) {
                    Ticket last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                }
                // removing middle or last ticket
                else {
                    prev.next = temp.next;
                }

                System.out.println("Ticket " + id + " removed");
                return;
            }

            prev = temp;
            temp = temp.next;

        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // display all tickets
    void displayTickets() {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;
        System.out.println("Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + temp.ticketId);
            System.out.println("Customer: " + temp.customerName);
            System.out.println("Movie: " + temp.movieName);
            System.out.println("Seat: " + temp.seatNumber);
            System.out.println("Time: " + temp.bookingTime);
            System.out.println("----------------------");

            temp = temp.next;
        } while (temp != head);
    }

    // search ticket by customer or movie name
    void searchTicket(String keyword) {

        if (head == null) {
            System.out.println("No tickets to search");
            return;
        }

        Ticket temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(keyword) ||
                temp.movieName.equalsIgnoreCase(keyword)) {

                System.out.println("Ticket Found:");
                System.out.println("Ticket ID: " + temp.ticketId);
                System.out.println("Customer: " + temp.customerName);
                System.out.println("Movie: " + temp.movieName);
                System.out.println("Seat: " + temp.seatNumber);
                System.out.println("-------------------");
                found = true;
            }

            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No matching ticket found");
        }
    }

    // count total booked tickets
    int countTickets() {

        if (head == null)
            return 0;

        int count = 0;
        Ticket temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}
