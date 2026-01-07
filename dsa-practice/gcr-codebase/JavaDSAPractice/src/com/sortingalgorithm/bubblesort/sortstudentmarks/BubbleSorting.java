package com.sortingalgorithm.bubblesort.sortstudentmarks;

class BubbleSorting {

    // bubble sort logic
    void sort(int[] marks) {

        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - 1 - i; j++) {

                if (marks[j] > marks[j + 1]) {
                    // swap
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }
}
