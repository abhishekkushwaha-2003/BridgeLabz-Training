// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results


//create a class FactorsCalculator 
import java.util.Scanner;

public class FactorsCalculator {

    public static void main(String[] args) {

        //create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input as number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        //find factors
        int[] factors = findFactors(number);

        // Displaying factors
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Calculating results
        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        // Displaying results
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }

 // Static method to find factors of a number and return array 
    public static int[] findFactors(int number) {

        int count = 0;

        //count number of factors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array with factor count
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors in array
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        // Return factors array
        return factors;
    }

    // Method to find sum of factors
    public static int findSum(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }

        return sum;
    }

    // Method to find product of factors
    public static long findProduct(int[] factors) {
        long product = 1;

        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        return product;
    }

    // Method to find sum of squares of factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;

        for (int i = 0; i < factors.length; i++) {
            sumOfSquares += Math.pow(factors[i], 2);
        }

        return sumOfSquares;
    }
}
