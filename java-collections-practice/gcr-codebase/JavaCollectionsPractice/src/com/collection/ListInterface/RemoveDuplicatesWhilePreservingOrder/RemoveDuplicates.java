package com.collection.ListInterface.RemoveDuplicatesWhilePreservingOrder;

import java.util.ArrayList;
import java.util.List;

class RemoveDuplicates {

    public static void main(String[] args) {
    	// adding numbers in list
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        // printing original list
        System.out.println("Original List: " + list);

        List<Integer> result = new ArrayList<>();
        // checking for duplicate number
        for (int num : list) {
            if (!result.contains(num)) {
                result.add(num);
            }
        }
        // printing list after removing duplicates
        System.out.println("After Removing Duplicates: " + result);
    }
}
