// create a class BMICalculator2D to Calculate BMI of all the persons and store them in the personData array 

import java.util.Scanner;

public class BMICalculator2D{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // takin input  Number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Arrays
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Taking height and weight input
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.print("Height (meters): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Weight (kg): ");
            personData[i][1] = sc.nextDouble();

            // Check for negative values
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Enter again.");
                i--; 
            }
        }

        // Calculate BMI and status
        for (int i = 0; i < number; i++) {

            // BMI formula
            personData[i][2] = personData[i][1] /
                               (personData[i][0] * personData[i][0]);

            // Weight status
            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display results
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height = " + personData[i][0]);
            System.out.println("Weight = " + personData[i][1]);
            System.out.println("BMI = " + personData[i][2]);
            System.out.println("Status = " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}
