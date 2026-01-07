package com.hashmapandhashfunction.twosumproblem;

import java.util.HashMap;

class TwoSum {

    // method to find two indices
    int[] findTwoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // loop through array
        for (int i = 0; i < arr.length; i++) {

            int required = target - arr[i];

            // check if required value already exists
            if (map.containsKey(required)) {

                // return indices
                return new int[]{ map.get(required), i };
            }

            // store current value with index
            map.put(arr[i], i);
        }

        // if no pair found
        return new int[]{ -1, -1 };
    }
}

