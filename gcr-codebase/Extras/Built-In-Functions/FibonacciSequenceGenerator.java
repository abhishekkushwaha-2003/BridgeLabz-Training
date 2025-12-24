// Program to generate Fibonacci sequence up to user-specified number of terms
import java.util.Scanner;


class FibonacciSequenceGenerator {

    // Method to calculate and print Fibonacci sequence
	
    public static void generateFibonacci(int terms) {

        // First two numbers in Fibonacci sequence
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci sequence up to " + terms + " terms:");

        for (int i = 1; i <= terms; i++) {

            // Print the current number
            System.out.print(first + " ");

            // Calculate next number
            int next = first + second;

            // Update first and second for next iteration
            first = second;
            second = next;
        }

        System.out.println(); // move to next line after sequence
    }

    public static void main(String[] args) {

        // Scanner to read input from user
        Scanner input = new Scanner(System.in);

        // Ask user for number of terms
		
        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int terms = input.nextInt();

        // Call method to generate Fibonacci sequence
        generateFibonacci(terms);

        // Close scanner
        input.close();
    }
}
