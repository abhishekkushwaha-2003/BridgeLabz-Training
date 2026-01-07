package com.searching.filereader;

// create a class to  counts how many times a given word appears in a file using FileReader
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

class CountOccurrenceOfWord {

    // Main method
    public static void main(String[] args) {

        // Defining the word to be searched
        String targetWord = "java";

        // Initializing counter to store word occurrence count
        int count = 0;

        // Declaring BufferedReader reference
        BufferedReader br = null;

        try {
            // Creating FileReader object to read the file
            FileReader fr = new FileReader("filereader.txt");

            // Wrapping FileReader with BufferedReader
            br = new BufferedReader(fr);

            // Variable to store each line from the file
            String line;

            // Reading file line by line
            while ((line = br.readLine()) != null) {

                // Converting line to lower case for case-insensitive comparison
                line = line.toLowerCase();

                // Splitting line into words using space
                String[] words = line.split(" ");

                // Looping through each word
                for (int i = 0; i < words.length; i++) {

                    // Checking if current word matches the target word
                    if (words[i].equals(targetWord)) {

                        // Incrementing count if word is found
                        count++;
                    }
                }
            }

            // Printing final count of the word
            System.out.println("Word '" + targetWord + "' occurs " + count + " times");

        } catch (IOException e) {

            // Handling file related exceptions
            e.printStackTrace();

        } finally {

            try {
                // Closing BufferedReader to release resources
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {

                // Handling exception while closing the file
                e.printStackTrace();
            }
        }
    }
}
