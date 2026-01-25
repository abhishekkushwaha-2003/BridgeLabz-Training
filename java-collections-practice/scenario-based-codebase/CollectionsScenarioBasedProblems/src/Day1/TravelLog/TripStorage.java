package Day1.TravelLog;

import java.io.*;
import java.util.List;

public class TripStorage {

    // write trips to file
    public static void saveTrips(List<Trip> trips, String fileName) {

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(trips);
            System.out.println("Trips saved successfully");

        } catch (Exception e) {
            System.out.println("Error saving trips");
        }
    }

    // read trips from file
    @SuppressWarnings("unchecked")
    public static List<Trip> loadTrips(String fileName) {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            return (List<Trip>) ois.readObject();

        } catch (Exception e) {
            System.out.println("Error loading trips");
            return null;
        }
    }
}
