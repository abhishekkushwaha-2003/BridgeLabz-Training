package com.day6.MergeSort.FleetManager;

//Contains Merge Sort logic for vehicle scheduling
public class FleetManagerClass {

 // Merge Sort method
 public static void mergeSort(Vehicle[] vehicles, int left, int right) {

     // Base condition
     if (left < right) {

         int mid = (left + right) / 2;

         // Sort left half
         mergeSort(vehicles, left, mid);

         // Sort right half
         mergeSort(vehicles, mid + 1, right);

         // Merge both halves
         merge(vehicles, left, mid, right);
     }
 }

 // Merge two sorted sublists
 private static void merge(Vehicle[] vehicles, int left, int mid, int right) {

     int n1 = mid - left + 1;
     int n2 = right - mid;

     Vehicle[] L = new Vehicle[n1];
     Vehicle[] R = new Vehicle[n2];

     // Copy data into temp arrays
     for (int i = 0; i < n1; i++)
         L[i] = vehicles[left + i];

     for (int j = 0; j < n2; j++)
         R[j] = vehicles[mid + 1 + j];

     int i = 0, j = 0, k = left;

     // Merge while comparing mileage
     while (i < n1 && j < n2) {

         if (L[i].mileage <= R[j].mileage) {
             vehicles[k++] = L[i++];
         } else {
             vehicles[k++] = R[j++];
         }
     }

     // Copy remaining vehicles
     while (i < n1)
         vehicles[k++] = L[i++];

     while (j < n2)
         vehicles[k++] = R[j++];
 }

 // Display all vehicles
 public static void displayVehicles(Vehicle[] vehicles) {
     for (Vehicle v : vehicles) {
         v.display();
     }
 }
}
