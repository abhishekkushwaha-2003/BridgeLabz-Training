package com.eventease;

class ConferenceEvent extends Event {

    ConferenceEvent(int id, String location, String date, int attendees) {
        super(id, "Conference", location, date, attendees);
    }

    public void schedule() {
        System.out.println("Conference scheduled with audio setup");
        calculatePrice(15000, 7000, 1000);
    }
}
