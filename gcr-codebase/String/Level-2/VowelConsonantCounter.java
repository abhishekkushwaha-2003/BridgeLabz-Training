// Program to find vowels and consonants in a string
// and display the count of vowels and consonants

import java.util.Scanner;

public class VowelConsonantCounter {

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

    // Method to count vowels and consonants in a string
	
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            String type = checkCharType(ch);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take string input
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // Count vowels and consonants
		
        int[] counts = countVowelsConsonants(text);

        // Display result
		
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}
