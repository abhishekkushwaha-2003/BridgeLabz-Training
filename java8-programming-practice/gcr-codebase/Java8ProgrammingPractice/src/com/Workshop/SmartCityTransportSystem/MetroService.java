package com.Workshop.SmartCityTransportSystem;

class MetroService implements TransportService {

    private String route;
    private double fare;
    private String time;

    MetroService(String route, double fare, String time) {
        this.route = route;
        this.fare = fare;
        this.time = time;
    }

    public String getServiceName() { return "Metro"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public String getDepartureTime() { return time; }
}

