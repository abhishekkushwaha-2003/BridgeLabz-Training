package com.day2.trafficmanager;

public class TrafficApp {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager(3);

        tm.requestEntry("CAR-101");
        tm.requestEntry("CAR-102");
        tm.requestEntry("CAR-103");
        tm.requestEntry("CAR-104");

        tm.allowEntry();
        tm.allowEntry();
        tm.printRoundabout();

        tm.exitRoundabout("CAR-101");
        tm.printRoundabout();

        tm.allowEntry();
        tm.printRoundabout();
    }
}