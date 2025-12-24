// Program to replace a given word with another word in a sentence

// Scanner for taking user input
import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {

        // Create Scanner object to take input
		
        Scanner input = new Scanner(System.in);

        // Take sentence input from user
		
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        // Take word to be replaced
		
        System.out.print("Enter word to replace: ");
        String oldWord = input.nextLine();

        // Take new word
		
        System.out.print("Enter new word: ");
        String newWord = input.nextLine();

        // Call replace method
		
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // Display modified sentence
		
        System.out.println("Modified Sentence: " + modifiedSentence);

        input.close();
    }

    // Method to replace old word with new word
	
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        // Split sentence into words
		
        String[] words = sentence.split(" ");

        // String to store final sentence
        String result = "";

        // Loop through each word
		
        for (int i = 0; i < words.length; i++) {

            // Check if word matches oldWord
			
            if (words[i].equals(oldWord)) {

                // Replace with newWord
				
                result = result + newWord;
            } else {

                // Keep word as it is
				
                result = result + words[i];
            }

            // Add space between words
			
            if (i < words.length - 1) {
                result = result + " ";
            }
        }

        return result;
    }
}
