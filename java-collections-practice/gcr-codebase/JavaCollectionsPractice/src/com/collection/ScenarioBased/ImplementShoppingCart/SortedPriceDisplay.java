package com.collection.ScenarioBased.ImplementShoppingCart;

import java.util.Map;
import java.util.TreeMap;

// This class displays items sorted by price
class SortedPriceDisplay {

    void displaySortedByPrice(Map<String, Integer> cartItems) {

        // TreeMap sorts by key, so we use price as key
        TreeMap<Integer, String> sortedMap = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
            sortedMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nItems Sorted by Price:");
        for (Map.Entry<Integer, String> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue() + " : " + entry.getKey());
        }
    }
}
