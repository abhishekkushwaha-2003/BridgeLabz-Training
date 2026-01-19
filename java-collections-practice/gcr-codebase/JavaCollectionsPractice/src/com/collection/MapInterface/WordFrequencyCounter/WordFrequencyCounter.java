package com.collection.MapInterface.WordFrequencyCounter;

import java.util.HashMap;
import java.util.Map;

class WordFrequencyCounter {

	// main method
    public static void main(String[] args) {

    	// string of words
        String text = "Hello world, hello Java!";

        // Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z ]", "");

        String[] words = text.split("\\s+");

        Map<String, Integer> map = new HashMap<>();

        // loop in String for word count
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // displaying the result
        System.out.println(map);
    }
}

