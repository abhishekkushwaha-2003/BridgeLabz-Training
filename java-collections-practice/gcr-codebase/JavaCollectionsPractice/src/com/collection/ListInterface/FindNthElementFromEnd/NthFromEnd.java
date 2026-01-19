package com.collection.ListInterface.FindNthElementFromEnd;

import java.util.LinkedList;

class NthFromEnd {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 3;

        String result = findNthFromEnd(list, n);
        System.out.println("The "+n+" Position Element from End: " + result);
    }

    // Method to find nth element from end
    static String findNthFromEnd(LinkedList<String> list, int n) {

        int slow = 0;
        int fast = 0;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast++;
        }

        // Move both pointers
        while (fast < list.size()) {
            slow++;
            fast++;
        }

        return list.get(slow);
    }
}
