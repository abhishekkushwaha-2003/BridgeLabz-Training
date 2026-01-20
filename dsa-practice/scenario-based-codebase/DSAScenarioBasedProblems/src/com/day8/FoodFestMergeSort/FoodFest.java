package com.day8.FoodFestMergeSort;
// create a class FoodFast which contains merge sort logic 
public class FoodFest {

 // Merge Sort method
 public static void mergeSort(Stall[] stalls, int left, int right) {

     // Base condition
     if (left < right) {

         int mid = (left + right) / 2;

         // Sort left half
         mergeSort(stalls, left, mid);

         // Sort right half
         mergeSort(stalls, mid + 1, right);

         // Merge both halves
         merge(stalls, left, mid, right);
     }
 }

 // Merge two sorted sublists (stable)
 private static void merge(Stall[] stalls, int left, int mid, int right) {

     int n1 = mid - left + 1;
     int n2 = right - mid;

     Stall[] L = new Stall[n1];
     Stall[] R = new Stall[n2];

     // Copy data to temporary arrays
     for (int i = 0; i < n1; i++)
         L[i] = stalls[left + i];

     for (int j = 0; j < n2; j++)
         R[j] = stalls[mid + 1 + j];

     int i = 0, j = 0, k = left;

     // Merge by footfall (descending order)
     // >= ensures STABILITY for equal footfall
     while (i < n1 && j < n2) {
         if (L[i].footfall >= R[j].footfall) {
             stalls[k++] = L[i++];
         } else {
             stalls[k++] = R[j++];
         }
     }

     // Copy remaining elements
     while (i < n1)
         stalls[k++] = L[i++];

     while (j < n2)
         stalls[k++] = R[j++];
 }

 // Display all stalls
 public static void displayStalls(Stall[] stalls) {
     for (Stall s : stalls) {
         s.display();
     }
 }
}
