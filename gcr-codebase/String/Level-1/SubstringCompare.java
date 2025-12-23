// Write a program to create a substring from a String using the charAt() method
// and also using the built-in substring() method. Finally compare both substrings.

import java.util.Scanner;

// Create a class SubstringCompare
public class SubstringCompare {

    // Method to create substring using charAt()
    static String createSubstring(String text, int start, int end) {
        String result = "";

        // Create substring character by character
        for (int i = start; i < end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        // If length is not same, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    // Main method
    // Take user input and compare substrings
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Take start and end index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // Create substring using charAt()
        String sub1 = createSubstring(text, start, end);

        // Create substring using built-in method
        String sub2 = text.substring(start, end);

        // Compare both substrings
        boolean result = compareStrings(sub1, sub2);

        // Display results
        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using built-in method substring(): " + sub2);

        if (result) {
            System.out.println("Both substrings are Same");
        } else {
            System.out.println("Both substrings are Different");
        }
    }
}
