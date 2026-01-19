package com.collection.SetInterface.UnionAndIntersectionOfTwoSets;

import java.util.HashSet;
import java.util.Set;

class UnionIntersection {

    public static void main(String[] args) {
    	// adding elements in set one 
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // adding elements in set two
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        // displaying the result  
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }
}
