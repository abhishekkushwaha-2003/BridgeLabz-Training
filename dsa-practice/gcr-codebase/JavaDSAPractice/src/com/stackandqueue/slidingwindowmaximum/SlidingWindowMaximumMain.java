package com.stackandqueue.slidingwindowmaximum;

public class SlidingWindowMaximumMain  {
    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Sliding Window Maximum:");
        SlidingWindowMaximum.printMax(arr, k);
    }
}

