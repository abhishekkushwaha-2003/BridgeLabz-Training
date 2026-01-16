package com.day4.mergesort.ZipZipMart;
import java.time.LocalDate;

public class ZipZipMartMain {

    // Merge Sort entry method
    public static void mergeSort(SalesRecord[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted halves (STABLE)
    private static void merge(SalesRecord[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        SalesRecord[] L = new SalesRecord[n1];
        SalesRecord[] R = new SalesRecord[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            // Sort by date, then amount
            if (L[i].date.isBefore(R[j].date) ||
               (L[i].date.isEqual(R[j].date) && L[i].amount <= R[j].amount)) {

                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        // Copy remaining
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void display(SalesRecord[] records) {
        for (SalesRecord r : records) {
            r.display();
        }
    }

    public static void main(String[] args) {

        SalesRecord[] records = {
            new SalesRecord(LocalDate.of(2026, 1, 15), 1200, "Delhi"),
            new SalesRecord(LocalDate.of(2026, 1, 14), 800, "Mumbai"),
            new SalesRecord(LocalDate.of(2026, 1, 15), 500, "Pune"),
            new SalesRecord(LocalDate.of(2026, 1, 13), 2000, "Chennai"),
            new SalesRecord(LocalDate.of(2026, 1, 14), 1500, "Bangalore")
        };

        System.out.println("Before Sorting:");
        display(records);

        mergeSort(records, 0, records.length - 1);

        System.out.println("\nAfter Sorting (By Date):");
        display(records);
    }
}
