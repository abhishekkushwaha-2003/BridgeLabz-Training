// Write a program to calculate BMI, BMI status, and display for 10 persons


import java.util.Scanner;

public class BMICalculator {

    // method to calculate BMI and status for a person
	
    public static String[] calculateBMI(double weight, double heightCm) {
	
		`// convert height to meters
        double heightM = heightCm / 100.0;

		// calculate BMI
        double bmi = weight / (heightM * heightM); 

        String status;

        // checking condition
		
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 40) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // store weight, height, BMI, and status in string array

        String[] result = new String[4];
        result[0] = String.format("%.2f", weight);
        result[1] = String.format("%.2f", heightCm);
        result[2] = String.format("%.2f", bmi);
        result[3] = status;

        return result;
    }

    // method to process all team members and calculate BMI
	
    public static String[][] processTeam(double[][] data) {
        String[][] results = new String[data.length][4];

        // loop through each person
		
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
			
			 // calculate BMI and status
            results[i] = calculateBMI(weight, height);
        }

        return results;
    }

    // method to display the results in tabular format
	
    public static void displayResults(String[][] results) {
        System.out.println("Weight(kg)\tHeight(cm)\tBMI\tStatus");
        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int teamSize = 10;
        double[][] teamData = new double[teamSize][2]; // first column weight, second column height

        // take user input for each team member
		
        for (int i = 0; i < teamSize; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            teamData[i][1] = sc.nextDouble();
        }

        // calculate BMI and status for team
		
        String[][] bmiResults = processTeam(teamData);

        // display results
        displayResults(bmiResults);

        sc.close(); // close scanner
    }
}
