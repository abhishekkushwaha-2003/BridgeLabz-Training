package com.collection.ListInterface.RotateElementsInList;

import java.util.ArrayList;
import java.util.List;

class RotateList {

    public static void main(String[] args) {
    	// adding numbers in a list
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int rotateBy = 2;
        // printing original list
        System.out.println("Original List: " + list);

        // Rotate logic
        for (int i = 0; i < rotateBy; i++) {
            int first = list.remove(0); // remove first element
            list.add(first);            // add it to end
        }
        // printing rotated list
        System.out.println("Rotated List: " + list);
    }
}
