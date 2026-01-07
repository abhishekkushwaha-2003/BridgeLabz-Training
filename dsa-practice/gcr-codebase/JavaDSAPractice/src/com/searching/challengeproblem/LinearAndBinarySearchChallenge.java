package com.searching.challengeproblem;

import java.util.Arrays;

// This class finds the first missing positive number using Linear Search
// and finds the index of a target number using Binary Search
class LinearAndBinarySearchChallenge {

    // Main method
    public static void main(String[] args) {

        // Creating an integer array
        int[] arr = {3, 4, -1, 1};

        // Defining the target element for binary search
        int target = 4;

        // Finding first missing positive number using linear search logic
        int missing = findFirstMissingPositive(arr.clone());

        // Printing first missing positive number
        System.out.println("First Missing Positive: " + missing);

        // Sorting array before applying binary search
        Arrays.sort(arr);

        // Finding index of target element using binary search
        int index = binarySearch(arr, target);

        // Printing index of target element
        System.out.println("Index of Target Element: " + index);
    }

    // This method finds the first missing positive number
    static int findFirstMissingPositive(int[] arr) {

        int n = arr.length;

        // Marking numbers as visited using negative marking
        for (int i = 0; i < n; i++) {

            // Getting absolute value of current element
            int value = Math.abs(arr[i]);

            // Checking if value is in valid range
            if (value >= 1 && value <= n) {

                // Marking the index as visited
                if (arr[value - 1] > 0) {
                    arr[value - 1] = -arr[value - 1];
                }
            }
        }

        // Finding first index which is not marked
        for (int i = 0; i < n; i++) {

            // If value is positive, index + 1 is missing
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        // If all numbers from 1 to n are present
        return n + 1;
    }

    // This method performs binary search to find target index
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

            // If target is smaller, search left half
            if (target < arr[mid]) {
                right = mid - 1;
            }
            // If target is greater, search right half
            else {
                left = mid + 1;
            }
        }

        // Returning -1 if target is not found
        return -1;
    }
}
