// Write a program to check if two texts are anagrams


import java.util.Scanner;

public class AnagramCheck {

    // check if two texts are anagrams
	
    public static boolean areAnagrams(String text1, String text2) {
        // if lengths are not equal, they cannot be anagrams
        if (text1.length() != text2.length()) {
            return false;
        }
		
		// frequency of characters in first text
        int[] freq1 = new int[256]; 
		
		// frequency of characters in second text
        int[] freq2 = new int[256];

        // find frequency of characters in first text
		
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
        }

        // find frequency of characters in second text
		
        for (int i = 0; i < text2.length(); i++) {
            freq2[text2.charAt(i)]++;
        }

        // compare frequencies of both texts
		
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // frequencies not equal, not anagram
            }
        }

        return true; /
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter first text
		
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        // ask user to enter second text
		
        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        // check if texts are anagrams
		
        boolean result = areAnagrams(text1, text2);

        // display the result
		
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close(); // close scanner
    }
}
