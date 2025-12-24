// Program to find the maximum of three numbers

// Scanner for taking user input
import java.util.Scanner;

public class MaximumOfThree {

    // Method to take three numbers from user
	
    public static int[] takeInput(Scanner input) {

        // Array to store three numbers
        int[] numbers = new int[3];

        // Take first number
		
        System.out.print("Enter first number: ");
        numbers[0] = input.nextInt();

        // Take second number
		
        System.out.print("Enter second number: ");
        numbers[1] = input.nextInt();

        // Take third number
		
        System.out.print("Enter third number: ");
        numbers[2] = input.nextInt();

        return numbers;
    }

    // Method to find maximum of three numbers
	
    public static int findMaximum(int[] numbers) {

        // Assume first number is maximum
        int max = numbers[0];

        // Compare with second number
        if (numbers[1] > max) {
            max = numbers[1];
        }

        // Compare with third number
        if (numbers[2] > max) {
            max = numbers[2];
        }

        return max;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Call method to take input
		
        int[] numbers = takeInput(input);

        // Call method to find maximum
		
        int maximumValue = findMaximum(numbers);

        // Display the maximum value
		
        System.out.println("Maximum of the three numbers is: " + maximumValue);

        input.close();
    }
}
