package com.sortingalgorithm.mergesort.sortarraybookprices;

class MergeSortMain {

    // display method
    static void display(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] priceArray = {450, 299, 999, 150, 650, 399};

        // create book prices object
        BookPrices books = new BookPrices(priceArray);

        // create sorter object
        MergeSorting sorter = new MergeSorting();

        System.out.println("Before Sorting:");
        display(books.getPrices());

        // apply merge sort
        sorter.mergeSort(books.getPrices(), 0, books.getPrices().length - 1);

        System.out.println("After Sorting (Ascending):");
        display(books.getPrices());
    }
}
