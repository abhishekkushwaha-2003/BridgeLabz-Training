package com.searching.linearsearch;

// This class searches for the first sentence containing a specific word using Linear Search
class SearchForSpecificWord {

    // Main method
    public static void main(String[] args) {

        // Creating an array of sentences
        String[] sentences = {
            "Java is easy to learn",
            "Data structures are important",
            "Linear search is simple",
            "Programming needs practice"
        };

        // Defining the word to search
        String word = "search";

        // Calling method to find sentence containing the word
        String result = findSentence(sentences, word);

        // Printing the result
        System.out.println("The word '"+word+"' found in sentence : "+result);
    }

    // This method returns the first sentence that contains the given word
    static String findSentence(String[] sentences, String word) {

        // Looping through each sentence
        for (int i = 0; i < sentences.length; i++) {

            // Checking if current sentence contains the word
            if (sentences[i].toLowerCase().contains(word.toLowerCase())) {

                // Returning the sentence if word is found
                return sentences[i];
            }
        }

        // Returning Not Found if word is not present in any sentence
        return "Not Found";
    }
}
