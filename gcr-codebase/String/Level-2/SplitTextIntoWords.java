// Program to split the text into words and return each word with its length in a 2D array

import java.util.Scanner;

public class SplitTextIntoWords {

    // Method to find length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index goes out of range
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitText(String text) {

        int length = findLength(text);
        int wordCount = 1;

        // Count number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[j] = i;
                j++;
            }
        }

        // Store words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Method to create 2D array of words and their lengths
    public static String[][] wordWithLength(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Create 2D array with words and their lengths
        String[][] wordTable = wordWithLength(words);

        // Display in tabular format
        System.out.println("Word\tLength");
        System.out.println("----\t------");
        for (int i = 0; i < wordTable.length; i++) {
            // Convert length back to int for display
            int len = Integer.parseInt(wordTable[i][1]);
            System.out.println(wordTable[i][0] + "\t" + len);
        }
    }
}
