// Program to check whether a number is prime or not

// Scanner for taking user input
import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check if a number is prime
	
    public static boolean isPrime(int number) {

        // If number is less than or equal to 1, it is not prime
		
        if (number <= 1) {
            return false;
        }

        // Loop from 2 to number - 1
		
        for (int i = 2; i < number; i++) {

            // If number is divisible by i, it is not prime
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Take number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Call method to check prime
		
        boolean result = isPrime(number);

        // Display result
		
        if (result) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        input.close();
    }
}
