package com.Workshop.SmartCityTransportSystem;

class AmbulanceService implements TransportService, EmergencyService {

    private String route;
    private String time;

    AmbulanceService(String route, String time) {
        this.route = route;
        this.time = time;
    }

    public String getServiceName() { return "Ambulance"; }
    public String getRoute() { return route; }
    public double getFare() { return 0; }
    public String getDepartureTime() { return time; }
}
