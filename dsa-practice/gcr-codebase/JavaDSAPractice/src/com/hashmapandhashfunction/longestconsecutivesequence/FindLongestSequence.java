package com.hashmapandhashfunction.longestconsecutivesequence;

import java.util.HashSet;

class LongestSequenceFinder {

    // method to find longest consecutive sequence length
    int findLongest(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // add all elements to set
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        // check each number
        for (int num : arr) {

            // start counting only if previous number not present
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // check next consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                // update longest sequence
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
