// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths

import java.util.Scanner;

// create a class StudentGrades to find the grade

public class StudentGrades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking input Number of students
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        // Arrays
        int[] physics = new int[students];
        int[] chemistry = new int[students];
        int[] maths = new int[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        // Taking marks input
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();

            // Check for negative marks
            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks! Enter again.");
                i--; 
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < students; i++) {

            int total = physics[i] + chemistry[i] + maths[i];
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
            System.out.println("Marks: " + physics[i] + ", "+ chemistry[i] + ", " + maths[i]);
            System.out.println("Percentage = " + percentage[i]);
            System.out.println("Grade = " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
