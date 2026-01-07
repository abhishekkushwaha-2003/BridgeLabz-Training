package com.searching.binarysearch;

//This class finds the first and last occurrence of an element using Binary Search
class FirstAndLastOccurrence {

 // Main method
 public static void main(String[] args) {

     // Creating a sorted array
     int[] arr = {1, 2, 2, 2, 3, 4, 5};

     // Defining the target element
     int target = 2;

     // Finding first occurrence index
     int firstIndex = findFirstOccurrence(arr, target);

     // Finding last occurrence index
     int lastIndex = findLastOccurrence(arr, target);

     // Printing the result
     System.out.println("First Occurrence Index: " + firstIndex);
     System.out.println("Last Occurrence Index: " + lastIndex);
 }

 // This method finds the first occurrence of target element
 static int findFirstOccurrence(int[] arr, int target) {

     // Initializing left pointer
     int left = 0;

     // Initializing right pointer
     int right = arr.length - 1;

     // Variable to store first occurrence index
     int result = -1;

     // Binary search loop
     while (left <= right) {

         // Calculating mid safely to avoid overflow
         int mid = left + (right - left) / 2;

         // Checking if mid element is equal to target
         if (arr[mid] == target) {

             // Storing index and searching left side
             result = mid;
             right = mid - 1;

         } 
         // If target is smaller, search left half
         else if (target < arr[mid]) {

             // Updating right pointer
             right = mid - 1;

         } 
         // If target is greater, search right half
         else {

             // Updating left pointer
             left = mid + 1;
         }
     }

     // Returning first occurrence index
     return result;
 }

 // This method finds the last occurrence of target element
 static int findLastOccurrence(int[] arr, int target) {

     // Initializing left pointer
     int left = 0;

     // Initializing right pointer
     int right = arr.length - 1;

     // Variable to store last occurrence index
     int result = -1;

     // Binary search loop
     while (left <= right) {

         // Calculating mid safely to avoid overflow
         int mid = left + (right - left) / 2;

         // Checking if mid element is equal to target
         if (arr[mid] == target) {

             // Storing index and searching right side
             result = mid;
             left = mid + 1;

         } 
         // If target is smaller, search left half
         else if (target < arr[mid]) {

             // Updating right pointer
             right = mid - 1;

         } 
         // If target is greater, search right half
         else {

             // Updating left pointer
             left = mid + 1;
         }
     }

     // Returning last occurrence index
     return result;
 }
}
