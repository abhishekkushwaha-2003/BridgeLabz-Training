// Write a program to find frequency of characters using unique characters

import java.util.Scanner;

public class UniqueCharacterFrequency{

    // Method to find unique characters in a string
	
    public static char[] uniqueCharacters(String text) {
        int length = text.length(); // get string length
        char[] unique = new char[length]; // array to store unique characters
        int count = 0; // counter for unique characters

        // loop through each character in the string
		
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // checking condition
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            // if character is unique, store in array
			
            if (isUnique) {
                unique[count] = current;
                count++;
            }
        }

        // create a new array of exact size to store unique characters
		
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    // Method to find frequency of characters using unique characters
	
    public static String[][] charFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text); // get unique characters
        String[][] freqArray = new String[uniqueChars.length][2]; // 2D array for char and frequency

        // loop through unique characters to find frequency
		
        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            // count occurrences of the character in the string
			
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            // store character and its frequency in 2D array
			
            freqArray[i][0] = String.valueOf(ch);
            freqArray[i][1] = String.valueOf(count);
        }

        return freqArray;
    }

	// Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter a string
		
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // get character frequencies using unique characters
		
        String[][] result = charFrequency(inputString);

        // display the results
		
        System.out.println("Character\tFrequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close(); // close scanner
    }
}
