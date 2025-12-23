// Find unique characters in a string using the charAt() method and display the result


import java.util.Scanner;

// Write a program to find unique characters in a string


public class CharacterString {

    // Method to find the length of a string
	
    public static int getStringLength(String text) {
        int length = 0; // counter for string length
        try {
            while (true) {
                text.charAt(length); // try to access character at current index
                length++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // when index exceeds, we have reached the end of the string
        }
        return length; // return the calculated length
    }

    // Method to find unique characters in a string
	
    public static char[] findUniqueCharacters(String text) {
	
		// get string length
        int textLength = getStringLength(text); 
		
		// array to store unique characters
        char[] unique = new char[textLength]; 
        int uniqueCount = 0; // counter for unique characters

        // loop through each character of the string
        for (int i = 0; i < textLength; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true; // flag to check uniqueness

            // check if current character appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false; // character is not unique
                    break;
                }
            }

            // if character is unique, store it in array
            if (isUnique) {
                unique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // create a new array of exact size to store unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = unique[i];
        }

        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter a string
		
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // find unique characters using the method
		
        char[] uniqueChars = findUniqueCharacters(inputString);

        // display the result
		
        System.out.print("Unique characters in the string: ");
        for (char ch : uniqueChars) {
            System.out.print(ch + " ");
        }
        System.out.println();

        sc.close(); // close scanner
    }
}
