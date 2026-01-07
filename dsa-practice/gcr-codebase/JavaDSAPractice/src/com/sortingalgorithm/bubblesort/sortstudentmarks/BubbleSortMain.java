package com.sortingalgorithm.bubblesort.sortstudentmarks;

class BubbleSortMain {

    // method to display marks
    static void display(int[] marks) {
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] marksArray = {78, 45, 90, 60, 88};

        // create student marks object
        StudentMarks student = new StudentMarks(marksArray);

        // create sorter object
        BubbleSorting sorter = new BubbleSorting();

        System.out.println("Before Sorting:");
        display(student.getMarks());

        // sorting
        sorter.sort(student.getMarks());

        System.out.println("After Sorting (Ascending):");
        display(student.getMarks());
    }
}
