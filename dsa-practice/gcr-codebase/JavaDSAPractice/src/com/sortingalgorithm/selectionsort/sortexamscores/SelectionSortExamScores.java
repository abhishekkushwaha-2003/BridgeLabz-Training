package com.sortingalgorithm.selectionsort.sortexamscores;

public class SelectionSortExamScores {

    // selection sort method
    static void selectionSort(int[] scores) {
        int n = scores.length;

        // move boundary of unsorted part
        for (int i = 0; i < n - 1; i++) {

            // assume current index has minimum
            int minIndex = i;

            // find minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // swap minimum with first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] examScores = {72, 88, 45, 90, 66};

        System.out.println("Before Sorting:");
        for (int s : examScores) {
            System.out.print(s + " ");
        }

        // apply selection sort
        selectionSort(examScores);

        System.out.println("\nAfter Sorting:");
        for (int s : examScores) {
            System.out.print(s + " ");
        }
    }
}
