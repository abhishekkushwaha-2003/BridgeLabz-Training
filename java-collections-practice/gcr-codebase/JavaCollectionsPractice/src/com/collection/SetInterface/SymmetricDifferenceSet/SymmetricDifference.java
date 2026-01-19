package com.collection.SetInterface.SymmetricDifferenceSet;

import java.util.HashSet;
import java.util.Set;

class SymmetricDifference {

    public static void main(String[] args) {
    	// adding numbers in set 1
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        
        // adding numbers in set 2
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Union
        Set<Integer> result = new HashSet<>(set1);
        result.addAll(set2);

        // Intersection
        Set<Integer> common = new HashSet<>(set1);
        common.retainAll(set2);

        // Symmetric Difference
        result.removeAll(common);
        
        // displaying the result
        System.out.println("Symmetric Difference: " + result);
    }
}
