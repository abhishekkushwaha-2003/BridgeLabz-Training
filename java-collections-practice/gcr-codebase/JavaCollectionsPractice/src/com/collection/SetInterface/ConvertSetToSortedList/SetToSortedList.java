package com.collection.SetInterface.ConvertSetToSortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SetToSortedList {

    public static void main(String[] args) {
    	// adding elements in set
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        // Convert to list
        List<Integer> list = new ArrayList<>(set);

        // Sort list
        Collections.sort(list);
        
        // displaying the result
        System.out.println("Sorted List: " + list);
    }
}
