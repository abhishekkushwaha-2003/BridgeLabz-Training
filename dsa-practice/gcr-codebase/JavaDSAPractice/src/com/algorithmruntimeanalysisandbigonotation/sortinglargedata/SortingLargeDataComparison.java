package com.algorithmruntimeanalysisandbigonotation.sortinglargedata;

import java.util.Random;

// This class compares Bubble Sort, Merge Sort and Quick Sort performance
class SortingLargeDataComparison {

    // Main method
    public static void main(String[] args) {

        // Defining dataset size
        int size = 10_000;

        // Creating array with random values
        int[] arr1 = generateArray(size);
        int[] arr2 = arr1.clone();
        int[] arr3 = arr1.clone();

        // ---------------- Bubble Sort ----------------

        // Storing start time for Bubble Sort
        long bubbleStart = System.nanoTime();

        // Applying Bubble Sort
        bubbleSort(arr1);

        // Storing end time for Bubble Sort
        long bubbleEnd = System.nanoTime();

        // ---------------- Merge Sort ----------------

        // Storing start time for Merge Sort
        long mergeStart = System.nanoTime();

        // Applying Merge Sort
        mergeSort(arr2, 0, arr2.length - 1);

        // Storing end time for Merge Sort
        long mergeEnd = System.nanoTime();

        // ---------------- Quick Sort ----------------

        // Storing start time for Quick Sort
        long quickStart = System.nanoTime();

        // Applying Quick Sort
        quickSort(arr3, 0, arr3.length - 1);

        // Storing end time for Quick Sort
        long quickEnd = System.nanoTime();

        // Printing execution times
        System.out.println("Bubble Sort Time (ns): " + (bubbleEnd - bubbleStart));
        System.out.println("Merge Sort Time  (ns): " + (mergeEnd - mergeStart));
        System.out.println("Quick Sort Time  (ns): " + (quickEnd - quickStart));
    }

    // This method generates an array with random values
    static int[] generateArray(int size) {

        Random random = new Random();
        int[] arr = new int[size];

        // Filling array with random numbers
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }

        return arr;
    }

    // This method performs Bubble Sort
    static void bubbleSort(int[] arr) {

        // Looping through array elements
        for (int i = 0; i < arr.length - 1; i++) {

            // Comparing adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {

                // Swapping if elements are in wrong order
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // This method performs Merge Sort
    static void mergeSort(int[] arr, int left, int right) {

        // Checking if array has more than one element
        if (left < right) {

            // Finding middle index
            int mid = left + (right - left) / 2;

            // Sorting left half
            mergeSort(arr, left, mid);

            // Sorting right half
            mergeSort(arr, mid + 1, right);

            // Merging both halves
            merge(arr, left, mid, right);
        }
    }

    // This method merges two sorted halves
    static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copying data to temporary arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merging arrays
        while (i < n1 && j < n2) {

            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copying remaining elements
        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }
    }

    // This method performs Quick Sort
    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Getting partition index
            int pi = partition(arr, low, high);

            // Sorting left part
            quickSort(arr, low, pi - 1);

            // Sorting right part
            quickSort(arr, pi + 1, high);
        }
    }

    // This method partitions the array
    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        // Rearranging elements around pivot
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

