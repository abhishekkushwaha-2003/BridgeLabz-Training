/* Write a program to take user input for 5 numbers and check whether a number is positive or negative. Further for positive numbers
 check if the number is even or odd. Finally compare the first and last elements of the array and display if they are equal, greater, or less */


//create class CheckingNumber
import java.util.Scanner;
public class CheckingNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Taking user input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // System.out.println("\nNumber Analysis:");

        // Loop through array to check positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {

            if (isPositive(numbers[i])) {
                System.out.print(numbers[i] + " is Positive and ");

                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        // Comparing first and last elements
        int result = compare(numbers[0], numbers[numbers.length - 1]);

        System.out.println("\nComparison of first and last elements:");

        if (result == 1) {
            System.out.println("First element is Greater than last element");
        } else if (result == 0) {
            System.out.println("First and last elements are Equal");
        } else {
            System.out.println("First element is Less than last element");
        }
		sc.close();
    }

   // Method to check whether a number is positive
    // Returns true if number is positive, else false
    public static boolean isPositive(int number) {
        return number > 0;
    }

    // Method to check whether a number is even
    // Returns true if even, else false
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}
