package com.collection.ListInterface.FindFrequencyOfElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FrequencyCounter {

    public static void main(String[] args) {

        // Input list
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("apple");
        list.add("banana");

        // Map to store frequency
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count frequency
        for (String item : list) {

            if (frequencyMap.containsKey(item)) {
                // If already present, increase count
                frequencyMap.put(item, frequencyMap.get(item) + 1);
            } else {
                // First time entry
                frequencyMap.put(item, 1);
            }
        }

        // Output
        System.out.println(frequencyMap);
    }
}
