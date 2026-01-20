package com.JavaStreams.CountWordsInFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class WordCount {

    public static void main(String[] args) {

        String fileName = "count.txt";

        // Map to store word frequency
        Map<String, Integer> wordCount = new HashMap<>();

        // Read file using BufferedReader
        try (BufferedReader reader =
                     new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {

                // Convert to lowercase and remove punctuation
                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {

                    if (word.isEmpty()) {
                        continue;
                    }

                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("File error occurred: " + e.getMessage());
            return;
        }

        // Convert map entries to list for sorting
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(wordCount.entrySet());

        // Sort list by frequency (descending order)
        list.sort((e1, e2) -> e2.getValue() - e1.getValue());

        // Display top 5 words
        System.out.println("Top 5 most frequent words:");

        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {

            System.out.println(entry.getKey() + " : " + entry.getValue());
            count++;

            if (count == 5) {
                break;
            }
        }
    }
}
