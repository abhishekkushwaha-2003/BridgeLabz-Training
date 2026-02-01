package com.Workshop.SmartCityTransportSystem;

class Passenger {
    String name;
    String route;
    double fare;
    boolean peakTime;

    Passenger(String name, String route, double fare, boolean peakTime) {
        this.name = name;
        this.route = route;
        this.fare = fare;
        this.peakTime = peakTime;
    }

    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public boolean isPeakTime() { return peakTime; }
}
