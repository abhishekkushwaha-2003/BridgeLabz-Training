// Create a class PhysicsChemistryMathsAverage to find the average of three subjects

import java.util.Scanner;

public class PhysicsChemistryMathsAverage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		// create a scanner object to take input as marks

        System.out.print("Enter Physics marks: ");
		
		// assigning values 
		
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

		// create a variable total which stores the total marks
		
		// create a variable percentage to store percentage

        int total = physics + chemistry + maths;
        double percentage = total / 3.0;

		// create a grade char variable to store grades and String remarks

        char grade;
        String remarks;

		// checking conditions

        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching standards";
        } else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below standards";
        } else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1, too below standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

		// printing result

		
        System.out.println("Average Marks: " + percentage);
		
        System.out.println("Grade: " + grade);
		
        System.out.println("Remarks: " + remarks);

        sc.close();
    }
}
