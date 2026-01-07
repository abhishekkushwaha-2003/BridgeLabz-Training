package com.hashmapandhashfunction.checkpairsumarray;

import java.util.HashSet;

class FindPair{

    // Method to check if pair exists
    boolean hasPair(int[] arr, int target) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            int required = target - num;

            if (set.contains(required)) {
                System.out.println("Pair found: " + num + " + " + required);
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
