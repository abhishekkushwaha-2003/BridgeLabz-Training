// Program to check if a given string is a palindrome
import java.util.Scanner;

class PalindromeChecker {

    // Method to take input from user
	
    public static String getInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String userInput = input.nextLine();
        // Close scanner in main to avoid closing System.in here
        return userInput;
    }

    // Method to check if a string is palindrome
	
    public static boolean isPalindrome(String str) {
	
        // Remove spaces and convert to lowercase for uniform checking
		
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Compare characters from start and end
		
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // It's a palindrome
    }

    // Method to display the result
	
    public static void displayResult(String str, boolean result) {
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }

    public static void main(String[] args) {

        // Take input
        String inputString = getInput();

        // Check palindrome
        boolean palindromeResult = isPalindrome(inputString);

        // Display result
        displayResult(inputString, palindromeResult);
    }
}
