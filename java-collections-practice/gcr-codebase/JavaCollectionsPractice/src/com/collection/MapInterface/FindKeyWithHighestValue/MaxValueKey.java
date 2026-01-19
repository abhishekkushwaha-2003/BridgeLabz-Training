package com.collection.MapInterface.FindKeyWithHighestValue;

import java.util.HashMap;
import java.util.Map;

class MaxValueKey {

    public static void main(String[] args) {

    	// mapping the elements in map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // checking for maximum value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        // displaying the result
        System.out.println("The Key with the Highest Value is : "+maxKey);
    }
}
