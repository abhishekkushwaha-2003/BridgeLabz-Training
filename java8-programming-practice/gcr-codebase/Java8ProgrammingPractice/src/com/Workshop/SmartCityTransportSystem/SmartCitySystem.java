package com.Workshop.SmartCityTransportSystem;

import java.util.*;
import java.util.stream.*;

public class SmartCitySystem {

    public static void main(String[] args) {

        System.out.println("SMART CITY DASHBOARD \n");

        List<TransportService> services = Arrays.asList(
            new BusService("A-B", 20, "08:30"),
            new MetroService("A-C", 40, "08:10"),
            new TaxiService("B-C", 60, "08:05"),
            new AmbulanceService("City Hospital", "NOW")
        );

        
        System.out.println("Cheapest Services:");
        services.stream()
                .filter(s -> s.getFare() <= 40)
                .sorted(Comparator.comparing(TransportService::getFare))
                .forEach(TransportService::printServiceDetails);

        System.out.println("\n Emergency Services:");
        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(TransportService::printServiceDetails);

        FareCalculator taxiFare = d -> d * 15;
        double distance = GeoUtils.calculateDistance(1, 1, 4, 5);
        System.out.println("\nTaxi Fare for distance " + distance + " = " +
                taxiFare.calculateFare(distance));

        List<Passenger> passengers = Arrays.asList(
            new Passenger("Abhi", "A-B", 20, true),
            new Passenger("Rashi", "A-B", 20, false),
            new Passenger("Palak", "A-C", 40, true),
            new Passenger("Sonu", "B-C", 60, false),
            new Passenger("Rajeev", "A-C", 40, true)
        );

        Map<String, List<Passenger>> byRoute =
            passengers.stream()
                .collect(Collectors.groupingBy(Passenger::getRoute));

        System.out.println("\n Passengers Grouped by Route:");
        byRoute.forEach((r, p) ->
            System.out.println(r + " -> " + p.size())
        );

        Map<Boolean, List<Passenger>> peakSplit =
            passengers.stream()
                .collect(Collectors.partitioningBy(Passenger::isPeakTime));

        System.out.println("\n Peak Time Trips: " + peakSplit.get(true).size());
        System.out.println(" Non-Peak Trips: " + peakSplit.get(false).size());

        DoubleSummaryStatistics revenue =
            passengers.stream()
                .collect(Collectors.summarizingDouble(Passenger::getFare));

        System.out.println("\n Revenue Summary:");
        System.out.println("Total: " + revenue.getSum());
        System.out.println("Average Fare: " + revenue.getAverage());
        System.out.println("Max Fare: " + revenue.getMax());

        System.out.println("\n LIVE SERVICES:");
        services.forEach(TransportService::printServiceDetails);
    }
}
