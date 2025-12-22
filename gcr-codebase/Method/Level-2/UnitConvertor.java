/* Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
 */

public class UnitConvertor {
    
    public static void main(String[] args) {

        double km = 10;
        double miles = 5;
        double meters = 20;
        double feet = 30;

        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }

    // Constant to convert kilometers to miles
    private static final double KM_TO_MILES = 0.621371;

    // Constant to convert miles to kilometers
    private static final double MILES_TO_KM = 1.60934;

    // Constant to convert meters to feet
    private static final double METERS_TO_FEET = 3.28084;

    // Constant to convert feet to meters
    private static final double FEET_TO_METERS = 0.3048;

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

}
