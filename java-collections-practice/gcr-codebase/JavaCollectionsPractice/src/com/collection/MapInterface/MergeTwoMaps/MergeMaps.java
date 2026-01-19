package com.collection.MapInterface.MergeTwoMaps;
import java.util.HashMap;
import java.util.Map;

class MergeMaps {

    public static void main(String[] args) {

    	// mapping the elements in map1
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

    	// mapping the elements in map2
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> result = new HashMap<>(map1);

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            String key = entry.getKey();
            int value = entry.getValue();

            if (result.containsKey(key)) {
                result.put(key, result.get(key) + value);
            } else {
                result.put(key, value);
            }
        }

        // displaying the result
        System.out.println(result);
    }
}
