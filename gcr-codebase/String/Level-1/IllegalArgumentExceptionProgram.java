// Write a program to demonstrate IllegalArgumentException
// Generate a runtime exception using substring() and then handle it using try-catch

import java.util.Scanner;

// Create a class IllegalArgumentExceptionProgram
public class IllegalArgumentExceptionProgram {

    // Method to generate Runtime Exception
    static void generateException(String text) {

        // This will generate RuntimeException because start index > end index
        String sub = text.substring(5, 2);

        System.out.println(sub);
    }

    // Method to handle Runtime Exception
    static void handleException(String text) {

        try {
            // This will generate RuntimeException
            String sub = text.substring(5, 2);
            System.out.println(sub);

        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException
            System.out.println("IllegalArgumentException handled");

        } catch (RuntimeException e) {
            // Handle other Runtime Exceptions
            System.out.println("RuntimeException handled");
        }
    }

    // Main method
    // Call method to generate exception and then handle the RuntimeException
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Calling method to generate exception
        // generateException(text);   // Uncomment to see abrupt termination

        // Calling method to handle exception
        handleException(text);
    }
}
