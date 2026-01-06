package com.eventease;

class BirthdayEvent extends Event {

    BirthdayEvent(int id, String location, String date, int attendees) {
        super(id, "Birthday Party", location, date, attendees);
    }

    // different scheduling logic
    public void schedule() {
        System.out.println("Birthday event scheduled with decoration");
        calculatePrice(5000, 3000, 500);
    }
}
