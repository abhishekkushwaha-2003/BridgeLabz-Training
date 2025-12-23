import java.util.Scanner;

// Write a program to find the frequency of characters in a string

public class CharacterFrequency {

    // Method to find frequency of characters and return as 2D array
	
    public static Object[][] findCharFrequency(String text) {
        int[] freq = new int[256]; // array to store frequency of each ASCII character

        // loop through the string to count frequency of each character
		
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++; // increment frequency
        }

        // count how many unique characters are there
		
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCount++;
            }
        }

        // create 2D array to store characters and their frequencies
		
        Object[][] result = new Object[uniqueCount][2];
        int index = 0;

        // loop through all ASCII characters and store character and frequency
		
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = (char) i; // character
                result[index][1] = freq[i];  // frequency
                index++;
            }
        }

        return result; // return 2D array
    }
	
	// Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // call method to find frequency of characters
        Object[][] charFreq = findCharFrequency(inputString);

        // display the result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < charFreq.length; i++) {
            System.out.println(charFreq[i][0] + "\t\t" + charFreq[i][1]);
        }

        sc.close(); // close scanner
    }
}
