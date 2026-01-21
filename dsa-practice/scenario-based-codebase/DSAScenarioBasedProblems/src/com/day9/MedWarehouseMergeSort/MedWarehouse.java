package com.day9.MedWarehouseMergeSort;

//Create a class which Contains Merge Sort logic for MedWarehouse
public class MedWarehouse {

 // Merge Sort entry method
 public static void mergeSort(Medicine[] meds, int left, int right) {

     // Base condition
     if (left < right) {

         int mid = (left + right) / 2;

         // Sort left half
         mergeSort(meds, left, mid);

         // Sort right half
         mergeSort(meds, mid + 1, right);

         // Merge both halves
         merge(meds, left, mid, right);
     }
 }

 // Merge two sorted sublists (stable)
 private static void merge(Medicine[] meds, int left, int mid, int right) {

     int n1 = mid - left + 1;
     int n2 = right - mid;

     Medicine[] L = new Medicine[n1];
     Medicine[] R = new Medicine[n2];

     // Copy data into temp arrays
     for (int i = 0; i < n1; i++)
         L[i] = meds[left + i];

     for (int j = 0; j < n2; j++)
         R[j] = meds[mid + 1 + j];

     int i = 0, j = 0, k = left;

     // Merge by expiry (earliest first)
     // <= keeps STABILITY for equal expiry dates
     while (i < n1 && j < n2) {
         if (L[i].expiryDay <= R[j].expiryDay) {
             meds[k++] = L[i++];
         } else {
             meds[k++] = R[j++];
         }
     }

     // Copy remaining elements
     while (i < n1)
         meds[k++] = L[i++];

     while (j < n2)
         meds[k++] = R[j++];
 }

 // Display all medicines
 public static void displayMedicines(Medicine[] meds) {
     for (Medicine m : meds) {
         m.display();
     }
 }

 // Simple alert for near-expiry medicines
 public static void alertNearExpiry(Medicine[] meds, int thresholdDay) {
     System.out.println("\nNear-Expiry Alerts (Expiry ≤ " + thresholdDay + "):");
     for (Medicine m : meds) {
         if (m.expiryDay <= thresholdDay) {
             m.display();
         }
     }
 }
}

