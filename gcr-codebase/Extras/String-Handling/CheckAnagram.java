// Program to check whether two strings are anagrams of each other

// Scanner for taking user input
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Take first string input from user
		
        System.out.print("Enter first string: ");
        String firstString = input.nextLine();

        // Take second string input from user
		
        System.out.print("Enter second string: ");
        String secondString = input.nextLine();

        // Convert both strings to lowercase
		
        firstString = firstString.toLowerCase();
        secondString = secondString.toLowerCase();

        // Check if lengths are equal
		
        if (firstString.length() != secondString.length()) {

            // If lengths are different, strings are not anagrams
			
            System.out.println("Strings are not anagrams");

        } else {

            // Convert strings to character arrays
			
            char[] firstArray = firstString.toCharArray();
            char[] secondArray = secondString.toCharArray();

            // Sort first character array
			
            for (int i = 0; i < firstArray.length - 1; i++) {
                for (int j = i + 1; j < firstArray.length; j++) {
                    if (firstArray[i] > firstArray[j]) {
                        char temp = firstArray[i];
                        firstArray[i] = firstArray[j];
                        firstArray[j] = temp;
                    }
                }
            }

            // Sort second character array
			
            for (int i = 0; i < secondArray.length - 1; i++) {
                for (int j = i + 1; j < secondArray.length; j++) {
                    if (secondArray[i] > secondArray[j]) {
                        char temp = secondArray[i];
                        secondArray[i] = secondArray[j];
                        secondArray[j] = temp;
                    }
                }
            }

            // Variable to check if arrays are same
			
            boolean isAnagram = true;

            // Compare both character arrays
			
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    isAnagram = false;
                    break;
                }
            }

            // Display result
			
            if (isAnagram) {
                System.out.println("Strings are anagrams");
            } else {
                System.out.println("Strings are not anagrams");
            }
        }

        input.close();
    }
}
