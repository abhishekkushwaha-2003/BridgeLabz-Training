package com.sortingalgorithm.insertionsort.sortemployeeid;

class InsertionSorting {

    // insertion sort method
    void sort(int[] ids) {

        int n = ids.length;

        // loop starts from second element
        for (int i = 1; i < n; i++) {

            int key = ids[i];   // current element
            int j = i - 1;

            // shift elements to right
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // place key at correct position
            ids[j + 1] = key;
        }
    }
}

