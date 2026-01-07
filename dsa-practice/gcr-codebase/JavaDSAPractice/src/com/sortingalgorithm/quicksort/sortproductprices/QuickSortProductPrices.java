package com.sortingalgorithm.quicksort.sortproductprices;

public class QuickSortProductPrices {

    // Quick Sort method
    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // sort left part
            quickSort(prices, low, pivotIndex - 1);

            // sort right part
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition method
    static int partition(int[] prices, int low, int high) {

        int pivot = prices[high];   // pivot element (last element)
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;

                // swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] productPrices = {999, 299, 799, 199, 450};

        System.out.println("Before Sorting:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }

        // apply quick sort
        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("\nAfter Sorting:");
        for (int price : productPrices) {
            System.out.print(price + " ");
        }
    }
}

