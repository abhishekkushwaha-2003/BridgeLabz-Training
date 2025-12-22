import java.util.Scanner;

public class TrigonometricCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calling  method
        double[] trigValues = calculateTrigonometricFunctions(angle);

        // Displaying  results
        System.out.printf("Sine of %.2f° = %.4f\n", angle, trigValues[0]);
        System.out.printf("Cosine of %.2f° = %.4f\n", angle, trigValues[1]);
        System.out.printf("Tangent of %.2f° = %.4f\n", angle, trigValues[2]);

        sc.close();
    }

    // Create a  Method calculateTrigonometricFunctions to calculate sine, cosine, tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        // Convert angle to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return as array
        return new double[]{sine, cosine, tangent};
    }
}
