// Write a program to demonstrate NumberFormatException
// Generate a runtime exception using Integer.parseInt()
// and then handle it using try-catch

import java.util.Scanner;

// Create a class NumberFormatExceptionProgram
public class NumberFormatExceptionProgram{

    // Method to generate NumberFormatException
    static void generateException(String text) {

        // This will generate NumberFormatException
        int num = Integer.parseInt(text);

        System.out.println("Number is: " + num);
    }

    // Method to handle NumberFormatException
    static void handleException(String text) {

        try {
            // This will generate NumberFormatException
            int num = Integer.parseInt(text);
            System.out.println("Number is: " + num);

        } catch (NumberFormatException e) {
            // Handle NumberFormatException
            System.out.println("NumberFormatException handled");

        } catch (RuntimeException e) {
            // Handle other RuntimeExceptions
            System.out.println("RuntimeException handled");
        }
    }

    // Main method
    // Call method to generate exception and then handle the RuntimeException
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input as String
        System.out.print("Enter a value: ");
        String text = sc.next();

        // Calling method to generate exception
        // generateException(text);   // Uncomment to see exception

        // Calling method to handle exception
        handleException(text);
    }
}
