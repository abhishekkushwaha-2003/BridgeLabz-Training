// Program to generate marks of students, calculate total, average, percentage, and grade

import java.util.Scanner;

public class StudentMarks {

    // Method to generate random marks for n students and 3 subjects
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3]; // 3 subjects

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 40 + (int)(Math.random() * 61); // 40 to 100
            }
        }

        return marks;
    }

    // Method to calculate total, average, percentage for each student
	
    public static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3]; // total, average, percentage

        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }
            double avg = Math.round(total / 3.0 * 100.0) / 100.0; // round to 2 decimals
            double perc = Math.round((total / 300.0) * 10000.0) / 100.0; // round to 2 decimals

            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = perc;
        }

        return stats;
    }

    // Method to calculate grade based on percentage
	
    public static String[] calculateGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            double perc = stats[i][2];
            if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else if (perc >= 40) grades[i] = "E";
            else grades[i] = "R";
        }

        return grades;
    }

    // Method to display scorecard
	
    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-------\t-------\t--------\t-----\t-----\t-------\t---------\t-----");

        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.print((int)stats[i][0] + "\t"); // total
            System.out.print(stats[i][1] + "\t");      // average
            System.out.print(stats[i][2] + "\t\t");    // percentage
            System.out.println(grades[i]);             // grade
        }
    }

    // Main method
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateMarks(n);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);

        displayScorecard(marks, stats, grades);
    }
}
