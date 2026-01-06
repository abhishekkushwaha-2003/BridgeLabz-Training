package com.eventease;

public class EventEaseApp {

    public static void main(String[] args) {

        User user = new User("Abhishek", "abhi@email.com");

        Event event1 = new BirthdayEvent(101, "Banquet Hall", "10-Oct-2026", 50);
        Event event2 = new ConferenceEvent(102, "Convention Center", "15-Nov-2026", 200);

        event1.schedule();
        event1.showPrice();

        System.out.println("------------");

        event2.schedule();
        event2.showPrice();
    }
}
