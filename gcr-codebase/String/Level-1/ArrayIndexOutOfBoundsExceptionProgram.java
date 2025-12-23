// Write a program to demonstrate ArrayIndexOutOfBoundsException
// Generate a runtime exception by accessing invalid array index
// and then handle it using try-catch

import java.util.Scanner;

// Create a class ArrayIndexOutOfBoundsExceptionProgram
public class ArrayIndexOutOfBoundsExceptionProgram {

    // Method to generate ArrayIndexOutOfBoundsException
    static void generateException(String[] names) {

        // Accessing index greater than array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    static void handleException(String[] names) {

        try {
            // Accessing index greater than array length
            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException handled");

        } catch (RuntimeException e) {
            // Handle other RuntimeExceptions
            System.out.println("RuntimeException handled");
        }
    }

    // Main method
    // Call method to generate exception and then handle the RuntimeException
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        // Take names as input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // Calling method to generate exception
        // generateException(names);   // Uncomment to see the exception

        // Calling method to handle exception
        handleException(names);
    }
}
