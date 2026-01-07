package com.searching.binarysearch;

//This class searches a target value in a 2D sorted matrix using Binary Search
public class SearchIn2DMatrix {

 // Main method
 public static void main(String[] args) {

     // Creating a 2D sorted matrix
     int[][] matrix = {
         {1, 3, 5, 7},
         {10, 11, 16, 20},
         {23, 30, 34, 60}
     };

     // Defining the target value to search
     int target = 16;

     // Calling method to search target in matrix
     boolean found = searchMatrix(matrix, target);

     // Printing the result
     System.out.println(found);
 }

 // This method returns true if target is found, otherwise false
 static boolean searchMatrix(int[][] matrix, int target) {

     // Getting number of rows in matrix
     int rows = matrix.length;

     // Getting number of columns in matrix
     int cols = matrix[0].length;

     // Initializing left pointer for binary search
     int left = 0;

     // Initializing right pointer for binary search
     int right = rows * cols - 1;

     // Binary search loop
     while (left <= right) {

         // Calculating mid safely to avoid overflow
         int mid = left + (right - left) / 2;

         // Converting mid index to row index
         int row = mid / cols;

         // Converting mid index to column index
         int col = mid % cols;

         // Getting the middle element from matrix
         int midValue = matrix[row][col];

         // Checking if middle element matches target
         if (midValue == target) {

             // Returning true if target is found
             return true;
         }

         // If target is smaller, search left half
         if (target < midValue) {

             // Updating right pointer
             right = mid - 1;

         } else {

             // If target is greater, search right half
             left = mid + 1;
         }
     }

     // Returning false if target is not found
     return false;
 }
}
