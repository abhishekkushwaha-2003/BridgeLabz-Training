// Program to check voting eligibility of 10 students based on age

import java.util.Scanner;

public class StudentVote{

    // Method to take age input of n students from the user
	
    public static int[] getStudentAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        return ages;
    }

    // Method to check voting eligibility
	
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);

            if (age < 0) {
                result[i][1] = "false"; // invalid age
            } else if (age >= 18) {
                result[i][1] = "true";  // can vote
            } else {
                result[i][1] = "false"; // cannot vote
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
	
    public static void displayTable(String[][] table) {
        System.out.println("Age\tCan Vote");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {

        int n = 10; // number of students

        // Take user input for ages
        int[] ages = getStudentAges(n);

        // Check voting eligibility
        String[][] votingResult = checkVotingEligibility(ages);

        // Display the result
        displayTable(votingResult);
    }
}
