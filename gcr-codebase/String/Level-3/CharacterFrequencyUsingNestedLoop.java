// Write a program to find the frequency of characters in a string using nested loops and display the result

import java.util.Scanner;

public class CharacterFrequencyUsingNestedLoop {

    // Method to find frequency of characters using nested loops
	
    public static String[][] charFrequency(String text) {
		// convert string to char array
        char[] chars = text.toCharArray(); 
        int length = chars.length;
		
		 // array to store frequency of each character
        int[] freq = new int[length];

        // outer loop to go through each character
		
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue; // skip if character is already counted
            freq[i] = 1; // initialize frequency to 1

            // inner loop to check for duplicates
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++; // increment frequency
                    chars[j] = '0'; // mark duplicate as counted
                }
            }
        }

        // count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (freq[i] != 0) uniqueCount++;
        }

        // create 2D array to store characters and their frequencies
		
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // store characters and frequencies in result array
        for (int i = 0; i < length; i++) {
            if (freq[i] != 0) {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result; 
    }
	
	// main method

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter a string
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        // call method to get frequency of characters
        String[][] charFreq = charFrequency(inputString);

        // display the result
        System.out.println("Character\tFrequency");
        for (int i = 0; i < charFreq.length; i++) {
            System.out.println(charFreq[i][0] + "\t\t" + charFreq[i][1]);
        }

        sc.close(); // close scanner
    }
}
