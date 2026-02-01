package com.Workshop.SmartCityTransportSystem;

class BusService implements TransportService {

    private String route;
    private double fare;
    private String time;

    BusService(String route, double fare, String time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }

    public String getServiceName() { return "Bus"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public String getDepartureTime() { return time; }
}
