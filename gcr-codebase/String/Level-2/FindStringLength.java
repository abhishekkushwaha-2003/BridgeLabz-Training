// Program to find the length of a string without using length() method

import java.util.Scanner;

public class FindStringLength{

    // Method to find length of string without using length()
    static int findStringLength(String text) {

        int count = 0;

        // Infinite loop to count characters
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index goes out of range
        }

        return count;
    }

    // Main method FindStringLength to find the length of string
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call user-defined method
        int lengthByMethod = findStringLength(text);

        // Call built-in length() method
        int lengthByBuiltIn = text.length();

        // Display results
        System.out.println("Length using user-defined method : " + lengthByMethod);
        System.out.println("Length using built-in length(): " + lengthByBuiltIn);
    }
}
