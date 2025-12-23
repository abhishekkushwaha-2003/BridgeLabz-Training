// Program to trim leading and trailing spaces from a string using charAt() method
// and compare with built-in trim() method

import java.util.Scanner;

public class TrimString {

    // Method to find start and end index 
	
    public static int[] trimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring 
	
    public static String createSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings 
	
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // Main method
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        // Get start and end index
        int[] indices = trimIndices(text);

        // Get substring 
        String trimmedByMethod = createSubstring(text, indices[0], indices[1]);

        // Trim using built-in method
		
        String trimmedByBuiltIn = text.trim();

        // Compare both results
		
        boolean isSame = compareStrings(trimmedByMethod, trimmedByBuiltIn);

        // Display results
        System.out.println("Trimmed string using charAt(): '" + trimmedByMethod + "'");
        System.out.println("Trimmed string using built-in trim(): '" + trimmedByBuiltIn + "'");
        System.out.println("Both results are same: " + isSame);
    }
}
