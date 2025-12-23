// Write a program to check if a text is palindrome and display the result


import java.util.Scanner;

public class PalindromeCheck {

    // check if text is palindrome using iterative method
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        // loop and compare characters from start and end
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // not palindrome if mismatch
            }
            start++;
            end--;
        }
        return true; // palindrome
    }

    // check if text is palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true; // reached middle, palindrome
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // not palindrome
        }
        return isPalindromeRecursive(text, start + 1, end - 1); // check next pair
    }

    // check if text is palindrome using character arrays
	
    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray(); // original characters
        char[] reversed = new char[original.length]; // reversed characters

        // reverse the string
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(original.length - 1 - i);
        }

        // compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false; // not palindrome
            }
        }
        return true; // palindrome
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter text
        System.out.print("Enter text to check palindrome: ");
        String inputText = sc.nextLine();

        // check palindrome using iterative method
        boolean result1 = isPalindromeIterative(inputText);
        System.out.println("Palindrome check (Iterative): " + (result1 ? "Yes" : "No"));

        // check palindrome using recursion
        boolean result2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        System.out.println("Palindrome check (Recursive): " + (result2 ? "Yes" : "No"));

        // check palindrome using character arrays
        boolean result3 = isPalindromeUsingArray(inputText);
        System.out.println("Palindrome check (Using Array): " + (result3 ? "Yes" : "No"));

        sc.close(); // close scanner
    }
}
