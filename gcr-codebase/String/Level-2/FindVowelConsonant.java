// Program to find vowels and consonants in a string
// and display the character type in a tabular format

import java.util.Scanner;

public class FindVowelConsonant {

    // Method to check if a character is vowel, consonant, or not a letter
	
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check for vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check for consonant (a-z)
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        } else {
            return "NotLetter";
        }
    }

    // Method to find vowels and consonants in a string
	
    public static String[][] findCharTypes(String text) {
        int length = text.length();
        String[][] table = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            table[i][0] = String.valueOf(ch);
            table[i][1] = checkCharType(ch);
        }

        return table;
    }

    // Method to display 2D array in tabular format
	
    public static void displayTable(String[][] table) {
        System.out.println("Character\tType");
        System.out.println("---------\t----");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Find character types
        String[][] resultTable = findCharTypes(text);

        // Display in tabular format
        displayTable(resultTable);
    }
}
