// Create a  program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade

import java.util.Scanner;

// create a class StudentGrades2D to find the grade of student by 2 D array

public class StudentGrades2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students taking input
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Arrays
        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        // Taking marks input
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            // Check for negative marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--; // repeat input
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Grade calculation
            if (percentage[i] >= 80){
                grade[i] = 'A';
				}
            else if (percentage[i] >= 70){
                grade[i] = 'B';
				}
            else if (percentage[i] >= 60){
                grade[i] = 'C';
				}
            else if (percentage[i] >= 50){
                grade[i] = 'D';
				}
            else if (percentage[i] >= 40){
                grade[i] = 'E';
				}
            else{
                grade[i] = 'R';
				}
        }

        // Display result
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Marks: " + marks[i][0] + ", "+ marks[i][1] + ", " + marks[i][2]);
            System.out.println("Percentage = " + percentage[i]);
            System.out.println("Grade = " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
