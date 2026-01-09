package com.algorithmruntimeanalysisandbigonotation.searchtargetinlargedataset;


import java.util.Arrays;

// This class compares Linear Search and Binary Search performance
class SearchTarget {

    // Main method
    public static void main(String[] args) {

        // Creating large dataset
        int size = 1_000_000;
        int[] arr = new int[size];

        // Filling array with sorted values
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }

        // Defining target element
        int target = size;

        // ---------------- Linear Search ----------------

        // Storing start time for Linear Search
        long linearStart = System.nanoTime();

        // Performing Linear Search
        linearSearch(arr, target);

        // Storing end time for Linear Search
        long linearEnd = System.nanoTime();

        // Calculating Linear Search time
        long linearTime = linearEnd - linearStart;

        // ---------------- Binary Search ----------------

        // Storing start time for Binary Search
        long binaryStart = System.nanoTime();

        // Performing Binary Search
        binarySearch(arr, target);

        // Storing end time for Binary Search
        long binaryEnd = System.nanoTime();

        // Calculating Binary Search time
        long binaryTime = binaryEnd - binaryStart;

        // Printing execution times
        System.out.println("Linear Search Time (ns): " + linearTime);
        System.out.println("Binary Search Time (ns): " + binaryTime);
    }

    // This method performs Linear Search
    static int linearSearch(int[] arr, int target) {

        // Looping through array one by one
        for (int i = 0; i < arr.length; i++) {

            // Checking if element matches target
            if (arr[i] == target) {
                return i;
            }
        }

        // Returning -1 if element not found
        return -1;
    }

    // This method performs Binary Search
    static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        // Binary search loop
        while (left <= right) {

            // Calculating mid safely
            int mid = left + (right - left) / 2;

            // Checking if mid element is target
            if (arr[mid] == target) {
                return mid;
            }

            // Searching left or right half
            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Returning -1 if element not found
        return -1;
    }
}

