package com.collection.SetInterface.CheckTwoSetsAreEqual;

import java.util.HashSet;
import java.util.Set;

class CheckSetEquality {

    public static void main(String[] args) {

        // First set
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Second set
        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        // Compare sets
        if (set1.equals(set2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
