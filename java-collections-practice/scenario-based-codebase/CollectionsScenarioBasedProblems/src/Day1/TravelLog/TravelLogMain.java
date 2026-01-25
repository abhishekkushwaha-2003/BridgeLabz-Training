package Day1.TravelLog;

import java.util.ArrayList;
import java.util.List;

public class TravelLogMain {
    public static void main(String[] args) {

        List<Trip> trips = new ArrayList<>();

        trips.add(new Trip(
                "Paris", "France", 7,
                "Visited Paris and enjoyed Eiffel Tower"));

        trips.add(new Trip(
                "Rome", "Italy", 4,
                "Rome trip was amazing"));

        trips.add(new Trip(
                "Paris", "France", 3,
                "Second time in Paris"));

        trips.add(new Trip(
                "Berlin", "Germany", 6,
                "Berlin wall and city tour"));

        // save trips
        TripStorage.saveTrips(trips, "trips.dat");

        // load trips
        List<Trip> loadedTrips = TripStorage.loadTrips("trips.dat");

        // analyze
        TripAnalyzer analyzer = new TripAnalyzer(loadedTrips);

        analyzer.findCitiesUsingRegex();
        analyzer.tripsLongerThanFiveDays();
        analyzer.uniqueCountriesVisited();
        analyzer.topThreeCities();
    }
}
