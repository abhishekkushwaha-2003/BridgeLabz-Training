package com.searching.linearsearch;

// This class finds the first negative number in an array using Linear Search
class FirstNegativeNumber {

    // Main method
    public static void main(String[] args) {

        // Creating an integer array
        int[] arr = {10, 5, 3, -2, -7, 8};

        // Calling method to find first negative number index
        int index = findFirstNegative(arr);

        // Printing the result
        System.out.println("First Negative Number found on index : "+ index);
    }

    // This method returns index of first negative number
    static int findFirstNegative(int[] arr) {

        // Looping through the array from start
        for (int i = 0; i < arr.length; i++) {

            // Checking if current element is negative
            if (arr[i] < 0) {

                // Returning index when first negative number is found
                return i;
            }
        }

        // Returning -1 if no negative number is found
        return -1;
    }
}
