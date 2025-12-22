// Create a class BMICalculator to find  the Body Mass Index 

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking iput from user
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Create arrays to store height, weight, BMI and status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Take input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            System.out.println("Enter height in meters: ");
            height[i] = sc.nextDouble();

            System.out.println("Enter weight in kg: ");
            weight[i] = sc.nextDouble();
        }

        // Calculate BMI and find status
        for (int i = 0; i < n; i++) {

            // BMI formula
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Check BMI range and assign status
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
				
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
				
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
				
            } else {
                status[i] = "Obese";
            }
        }

        // Display result
      
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height: " + height[i] + " meters");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.println("BMI: " + bmi[i]);
            System.out.println("Status: " + status[i]);
            System.out.println();
        }

        sc.close();
    }
}
