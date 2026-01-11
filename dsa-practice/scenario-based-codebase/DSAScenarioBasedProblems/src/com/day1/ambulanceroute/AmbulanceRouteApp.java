package com.day1.ambulanceroute;

public class AmbulanceRouteApp {

    public static void main(String[] args) {

        // Create ambulance route
        AmbulanceRoute route = new AmbulanceRoute();

        // Add hospital units (circular)
        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        // Display route
        route.displayRoute();

        // Find nearest available unit
        route.findAvailableUnit();

        // Remove unit under maintenance
        route.removeUnit("Radiology");

        // Display updated route
        route.displayRoute();

        // Try again to find available unit
        route.findAvailableUnit();
    }
}
