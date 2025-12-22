// create a program to find the BMI and display the height, weight, BMI and status of each individual

//create a class BMICalculator to claculate the BMI
import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array to store weight, height and BMI for 10 persons
        double[][] persons = new double[10][3];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            persons[i][1] = sc.nextDouble();

            // Calculate BMI and store it
            persons[i][2] = calculateBMI(persons[i][0], persons[i][1]);
        }

        // Displaying results
        
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            String status = getBMIStatus(persons[i][2]);

             System.out.print((i + 1) + "\t");
            System.out.print(persons[i][0] + "\t");
            System.out.print(persons[i][1] + "\t");
            System.out.print(persons[i][2] + "\t");
            System.out.println(status);
        }
    }

    // Method to calculate BMI
    // BMI = weight / (height * height)
    // height is converted from cm to meters
    public static double calculateBMI(double weight, double heightCm) {
        double heightMeter = heightCm / 100;
        return weight / (heightMeter * heightMeter);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";

        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";

        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";

        } else {
            return "Obese";
        }
    }
}
