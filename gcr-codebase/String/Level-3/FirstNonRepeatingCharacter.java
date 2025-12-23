import java.util.Scanner;

// Write a program to find the first non-repeating character in a string

public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character
	
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // array to store frequency of each ASCII character

        // loop through the string to count frequency of each character
		
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++; // increment frequency of character
        }

        // loop through the string again to find first character with frequency 1
		
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch; // first non-repeating character found
            }
        }

        return '\0'; // return null character if no non-repeating character found
    }
	
	// Main method 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // find the first non-repeating character using the method
        char result = findFirstNonRepeatingChar(inputString);

        // display the result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        sc.close(); // close scanner
    }
}
