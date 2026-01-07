package com.hashmapandhashfunction.findallsubarrayswithzerosum;

import java.util.*;

public class ZeroSumSubarrays {

    // Method to find all zero sum subarrays
    static void findZeroSumSubarrays(int[] arr) {

        // HashMap to store sum and list of indices
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // For subarray starting from index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i]; 

            // If sum already exists, zero sum subarray found
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println("Zero sum subarray from index "
                            + (start + 1) + " to " + i);
                }
            }

            // Add current index to map
            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};

        findZeroSumSubarrays(arr);
    }
}

