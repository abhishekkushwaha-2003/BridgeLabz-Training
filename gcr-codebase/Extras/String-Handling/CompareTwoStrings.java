// Program to compare two strings lexicographically without using built-in methods

// Scanner for taking user input
import java.util.Scanner;

public class CompareTwoStrings {
    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Take first string input from user
		
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        // Take second string input from user
		
        System.out.print("Enter second string: ");
        String secondString = input.nextLine();

        // Find the minimum length of both strings
		
        int minLength = firstString.length();
        if (secondString.length() < minLength) {
            minLength = secondString.length();
        }

        // Variable to track comparison result
		
        int result = 0;

        // Compare characters one by one
		
        for (int i = 0; i < minLength; i++) {

            // Get characters from both strings
			
            char charFromFirst = firstString.charAt(i);
            char charFromSecond = secondString.charAt(i);

            // Compare characters
			
            if (charFromFirst != charFromSecond) {
                result = charFromFirst - charFromSecond;
                break;
            }
        }

        // If characters are same till min length
		
        if (result == 0) {
            result = firstString.length() - secondString.length();
        }

        // Display comparison result
		
        if (result < 0) {
            System.out.println("\"" + firstString + "\" comes before \"" + secondString + "\" in lexicographical order");
        } else if (result > 0) {
            System.out.println("\"" + firstString + "\" comes after \"" + secondString + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }

        input.close();
    }
}
