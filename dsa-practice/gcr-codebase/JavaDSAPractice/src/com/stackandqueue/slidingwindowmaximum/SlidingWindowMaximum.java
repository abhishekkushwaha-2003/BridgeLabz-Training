package com.stackandqueue.slidingwindowmaximum;

import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMaximum {

    static void printMax(int[] arr, int k) {

        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove elements out of current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            // Add current index
            dq.addLast(i);

            //  Print max when window size is reached
            if (i >= k - 1) {
                System.out.print(arr[dq.peekFirst()] + " ");
            }
        }
    }
}
