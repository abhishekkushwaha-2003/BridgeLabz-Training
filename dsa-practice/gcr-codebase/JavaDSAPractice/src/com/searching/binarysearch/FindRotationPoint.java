package com.searching.binarysearch;

//This class finds the rotation point (smallest element index) in a rotated sorted array
class FindRotationPoint {

 // Main method
 public static void main(String[] args) {

     // Creating a rotated sorted array
     int[] arr = {4, 5, 6, 7, 0, 1, 2};

     // Calling method to find rotation point index
     int index = findRotationPoint(arr);

     // Printing the rotation point index
     System.out.println("The index of the smallest element in the array is : "+index);
 }

 // This method returns index of smallest element using Binary Search
 static int findRotationPoint(int[] arr) {

     // Initializing left pointer
     int left = 0;

     // Initializing right pointer
     int right = arr.length - 1;

     // Binary search loop
     while (left < right) {

         // Calculating mid safely to avoid overflow
         int mid = left + (right - left) / 2;

         // Checking if middle element is greater than right element
         if (arr[mid] > arr[right]) {

             // Smallest element is in the right half
             left = mid + 1;

         } else {

             // Smallest element is in the left half or at mid
             right = mid;
         }
     }

     // Returning index of smallest element (rotation point)
     return left;
 }
}
