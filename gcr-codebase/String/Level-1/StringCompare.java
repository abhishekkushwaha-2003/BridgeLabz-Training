// Write a program to compare two strings using the charAt() method and check the result with the built-in String equals() method

import java.util.Scanner;

public class StringCompare {

    // Method to compare two strings using charAt()
    static boolean compareStrings(String s1, String s2) {

        // If length is not same, strings are not equal
        if (s1.length() != s2.length()) {
            return false;
        }

        // Compare each character using charAt()
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // If all characters are same
        return true;
    }

    public static void main(String[] args) {

        // Take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // Compare using charAt() method
        boolean result1 = compareStrings(str1, str2);

        // Compare using built-in equals() method
        boolean result2 = str1.equals(str2);

        // Display results
        System.out.println("Result using charAt() method : " + result1);
        System.out.println("Result using Built-In method : " + result2);

        // Check if both results are same
        if (result1 == result2) {
            System.out.println("Both results are Same");
        } else {
            System.out.println("Both results are Different");
        }
    }
}
