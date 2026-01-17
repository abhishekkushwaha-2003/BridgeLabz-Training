package com.day4.quicksort.eventmanager;

public class EventManager {

    // Quick Sort entry method
    public static void quickSort(Ticket[] tickets, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(tickets, low, high);

            quickSort(tickets, low, pivotIndex - 1);
            quickSort(tickets, pivotIndex + 1, high);
        }
    }

    // Partition method
    private static int partition(Ticket[] tickets, int low, int high) {

        double pivot = tickets[high].price; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (tickets[j].price <= pivot) {
                i++;

                // swap tickets[i] and tickets[j]
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        // place pivot at correct position
        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }

    public static void display(Ticket[] tickets) {
        for (Ticket t : tickets) {
            t.display();
        }
    }

    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(101, 3500),
            new Ticket(102, 1200),
            new Ticket(103, 5000),
            new Ticket(104, 800),
            new Ticket(105, 2500)
        };

        System.out.println("Before Sorting:");
        display(tickets);

        quickSort(tickets, 0, tickets.length - 1);

        System.out.println("\nAfter Sorting by Price:");
        display(tickets);
    }
}
