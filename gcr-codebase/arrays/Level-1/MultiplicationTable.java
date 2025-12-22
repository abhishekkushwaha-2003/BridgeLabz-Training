// Create a program to print a multiplication table of a number


import java.util.Scanner;

// Create a class MultiplicationTable to print table

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number input from user 
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Array to store multiplication results
        int[] table = new int[10];

			// For loop for iteration and Storing multiplication values 
			for (int i = 1; i <= 10; i++) {
				table[i - 1] = number * i;
			}

			// Displaying  multiplication table
			for (int i = 1; i <= 10; i++) {
				System.out.println(number + " * " + i + " = " + table[i - 1]);
			}

			sc.close();
    }
}
