// Program to calculate factorial of a number using recursion
import java.util.Scanner;

class FactorialUsingRecursion {

    // Method to take input from user
    public static int getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = input.nextInt();
        return number;
    }

    // Recursive method to calculate factorial
	
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: 0! = 1! = 1
        }
        return n * factorial(n - 1); // Recursive call
    }

    // Method to display the result
	
    public static void displayResult(int number, long result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static void main(String[] args) {

        //Take input
        int num = getInput();

        // Calculate factorial using recursion
        long fact = factorial(num);

        //Display result
        displayResult(num, fact);
    }
}
