package com.searching.binarysearch;

//This class finds a peak element in an array using Binary Search
class PeakElement {

 // Main method
 public static void main(String[] args) {

     // Creating an integer array
     int[] arr = {1, 3, 20, 4, 1, 0};

     // Calling method to find peak element index
     int index = findPeakElement(arr);

     // Printing the peak element index
     System.out.println("Peak element is found on index : "+ index);
 }

 // This method returns index of any one peak element
 static int findPeakElement(int[] arr) {

     // Initializing left pointer
     int left = 0;

     // Initializing right pointer
     int right = arr.length - 1;

     // Binary search loop
     while (left <= right) {

         // Calculating mid safely to avoid overflow
         int mid = left + (right - left) / 2;

         // Checking if mid is a peak element
         if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
             (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {

             // Returning index if peak element is found
             return mid;
         }

         // If left neighbor is greater, peak lies on left side
         if (mid > 0 && arr[mid] < arr[mid - 1]) {

             // Moving search to left half
             right = mid - 1;

         } else {

             // Moving search to right half
             left = mid + 1;
         }
     }

     // Returning -1 (this line will normally not be reached)
     return -1;
 }
}
