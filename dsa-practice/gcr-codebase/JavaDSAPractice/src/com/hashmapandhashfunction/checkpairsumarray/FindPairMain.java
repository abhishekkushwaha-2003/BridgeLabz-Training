package com.hashmapandhashfunction.checkpairsumarray;

public class  FindPairMain {

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        // Create object of PairFinder
        FindPair finder = new FindPair();

        boolean result = finder.hasPair(arr, target);

        if (!result) {
            System.out.println("No pair found");
        }
    }
} 

