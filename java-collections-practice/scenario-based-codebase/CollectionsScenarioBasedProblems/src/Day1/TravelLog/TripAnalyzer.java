package Day1.TravelLog;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TripAnalyzer {

    private List<Trip> trips;

    public TripAnalyzer(List<Trip> trips) {
        this.trips = trips;
    }

    // 1 All cities visited 
    public void findCitiesUsingRegex() {

        Pattern cityPattern = Pattern.compile("[A-Z][a-z]+");

        System.out.println("\nCities found in notes:");
        for (Trip trip : trips) {
            Matcher matcher = cityPattern.matcher(trip.getNotes());
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }

    //  Trips longer than 5 days
    public void tripsLongerThanFiveDays() {

        System.out.println("\nTrips longer than 5 days:");
        for (Trip trip : trips) {
            if (trip.getDays() > 5) {
                System.out.println(trip.getCity() + " (" + trip.getDays() + " days)");
            }
        }
    }

    // Unique countries (Set)
    public void uniqueCountriesVisited() {

        Set<String> countries = new HashSet<>();

        for (Trip trip : trips) {
            countries.add(trip.getCountry());
        }

        System.out.println("\nUnique Countries Visited:");
        for (String c : countries) {
            System.out.println(c);
        }
    }

    // Top 3 cities visited most often
    public void topThreeCities() {

        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip trip : trips) {
            cityCount.put(
                    trip.getCity(),
                    cityCount.getOrDefault(trip.getCity(), 0) + 1
            );
        }

        System.out.println("\nTop 3 Cities Visited:");

        cityCount.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() + " -> " + e.getValue() + " times")
                );
    }
}
