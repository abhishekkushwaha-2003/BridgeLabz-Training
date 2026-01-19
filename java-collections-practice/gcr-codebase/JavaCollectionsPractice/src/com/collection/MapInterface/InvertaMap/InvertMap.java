package com.collection.MapInterface.InvertaMap;

import java.util.*;

class InvertMap {

    public static void main(String[] args) {

    	// putting the elements in map
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 1);

        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            int value = entry.getValue();
            String key = entry.getKey();

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            invertedMap.get(value).add(key);
        }

        // displaying the result
        System.out.println(invertedMap);
    }
}
