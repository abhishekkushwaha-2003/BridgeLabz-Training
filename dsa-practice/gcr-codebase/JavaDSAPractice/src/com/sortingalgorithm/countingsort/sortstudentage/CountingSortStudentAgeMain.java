package com.sortingalgorithm.countingsort.sortstudentage;

public class CountingSortStudentAgeMain {

    public static void main(String[] args) {

        int[] studentAges = {12, 15, 11, 18, 14, 10, 16, 13, 15};

        System.out.println("Before Sorting:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }

        // ages range from 10 to 18
        CountingSortStudentAge.countingSort(studentAges, 10, 18);

        System.out.println("\nAfter Sorting:");
        for (int age : studentAges) {
            System.out.print(age + " ");
        }
    }
}
