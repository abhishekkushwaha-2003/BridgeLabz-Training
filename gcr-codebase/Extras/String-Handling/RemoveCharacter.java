// Program to remove all occurrences of a specific character from a string

// Scanner for taking user input
import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Take string input from user
		
        System.out.print("Enter a string: ");
        String originalString = input.nextLine();

        // Take character input from user
		
        System.out.print("Enter character to remove: ");
        char removeChar = input.next().charAt(0);

        // String to store final result
		
        String modifiedString = "";

        // Loop through each character of the string
		
        for (int i = 0; i < originalString.length(); i++) {

            // Get current character
			
            char currentChar = originalString.charAt(i);

            // Check if current character is not equal to removeChar
			
            if (currentChar != removeChar) {

                // Add character to modified string
				
                modifiedString = modifiedString + currentChar;
            }
        }

        // Display the modified string
		
        System.out.println("Modified String: \"" + modifiedString + "\"");

        input.close();
    }
}
