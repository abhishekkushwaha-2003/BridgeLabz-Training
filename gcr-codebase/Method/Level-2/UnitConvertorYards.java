// Create a class UnitConvertorYards for unit conversion

public class UnitConvertorYards {

    // Constant to convert yards to feet
    private static final double YARDS_TO_FEET = 3;

    // Constant to convert feet to yards
    private static final double FEET_TO_YARDS = 0.333333;

    // Constant to convert meters to inches
    private static final double METERS_TO_INCHES = 39.3701;

    // Constant to convert inches to meters
    private static final double INCHES_TO_METERS = 0.0254;

    // Constant to convert inches to centimeters
    private static final double INCHES_TO_CM = 2.54;

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * INCHES_TO_CM;
    }

    // Main method to test the utility class
    public static void main(String[] args) {

        double yards = 5;
        double feet = 9;
        double meters = 2;
        double inches = 10;

        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");
        System.out.println(meters + " meters = " + convertMetersToInches(meters) + " inches");
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " meters");
        System.out.println(inches + " inches = " + convertInchesToCentimeters(inches) + " centimeters");
		
    }
}