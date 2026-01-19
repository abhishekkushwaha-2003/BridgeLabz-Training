package com.collection.SetInterface.FindSubsets;

import java.util.HashSet;
import java.util.Set;

class SubsetCheck {

    public static void main(String[] args) {

    	// adding elements in set1
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        // adding elements in set2
        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // checking for subsets
        if (set2.containsAll(set1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
