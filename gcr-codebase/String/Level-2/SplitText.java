// Program to split the text into words without using split() method
// and compare the result with the built-in split() method

import java.util.Scanner;

public class SplitText {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // exception occurs when index goes out of range
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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    // Main method
    // Take input, split text using both methods and compare results
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take text input
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Split using user-defined method
        String[] result1 = splitText(text);

        // Spliting
        String[] result2 = text.split(" ");

        // Compare both results
        boolean isSame = compareArrays(result1, result2);

        // Display result
        System.out.println("Result using charAt() method:");
        for (int i = 0; i < result1.length; i++) {
            System.out.println(result1[i]);
        }

        System.out.println("Comparison Result: " + isSame);
    }
}
