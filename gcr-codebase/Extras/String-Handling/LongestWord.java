// Program to find the longest word in a sentence


import java.util.Scanner; 

public class LongestWord {
    public static void main(String[] args) {
	
	   // Scanner class for taking user input
	   // Create Scanner object

        Scanner input = new Scanner(System.in); 

        // Ask user to enter a sentence
		
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
		
		// Split sentence into words
        String[] words = sentence.split(" "); 
		
		// Variable to store the longest word
        String longestWord = ""; 

        // Loop through each word
		
        for (String word : words) {
		
            // If current word is longer than longestWord, update longestWord
			
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Display the longest word
		
        System.out.println("The longest word in the sentence is: " + longestWord);

        input.close(); // Close Scanner
    }
}
