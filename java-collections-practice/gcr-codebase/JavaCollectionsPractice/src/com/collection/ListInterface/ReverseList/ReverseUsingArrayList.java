package com.collection.ListInterface.ReverseList;

import java.util.ArrayList;
import java.util.List;

class ReverseUsingArrayList {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Input list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List: " + list);

        int start = 0;
        int end = list.size() - 1;

        // Swapping elements
        while (start < end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);

            start++;
            end--;
        }

        System.out.println("Reversed List Using ArrayList : " + list);
    }
}
