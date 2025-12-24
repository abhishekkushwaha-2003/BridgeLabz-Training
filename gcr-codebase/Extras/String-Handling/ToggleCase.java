// Program to toggle the case of each character in a string

// Scanner for taking user input
import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Take string input from user
		
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // String to store final result
		
        String toggledString = "";

        // Loop through each character of the string
		
        for (int i = 0; i < originalString.length(); i++) {

            // Get current character
			
            char currentChar = originalString.charAt(i);

            // Check if character is uppercase
			
            if (currentChar >= 'A' && currentChar <= 'Z') {

                // Convert uppercase to lowercase
				
                toggledString = toggledString + (char)(currentChar + 32);

            }
            // Check if character is lowercase
			
            else if (currentChar >= 'a' && currentChar <= 'z') {

                // Convert lowercase to uppercase
				
                toggledString = toggledString + (char)(currentChar - 32);

            }
            // If character is not an alphabet
			
            else {

                // Add character as it is
				
                toggledString = toggledString + currentChar;
            }
        }

        // Display the toggled string
		
        System.out.println("String after toggling case: " + toggledString);

        input.close();
    }
}
