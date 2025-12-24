// Program to remove duplicate characters from user input string


// Scanner class import for taking user input
import java.util.Scanner; 

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner object

        // Ask user to enter a string
		
        System.out.print("Enter a string: ");
        String original = input.nextLine(); // Read full line input from user
		
		// String to store result without duplicates
        String result = ""; 

        // Loop through each character of the original string
		
        for (int i = 0; i < original.length(); i++) {
            char currentChar = original.charAt(i);

            // If result does not already contain currentChar, add it
			
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        // Display the final string without duplicates
		
        System.out.println("String after removing duplicates: " + result);

        input.close(); // Close Scanner
    }
}
