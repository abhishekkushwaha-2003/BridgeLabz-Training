// Create a class BMIOfPerson to find the BMI of a person

import java.util.Scanner;

public class BMIOfPerson {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //  Taking user input
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        // Determine weight status
        System.out.println("\nBMI: " + bmi);

		// checking condition and printing result
		
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        sc.close();
    }
}
