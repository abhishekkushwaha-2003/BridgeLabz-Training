package com.day5.Quicksort.CropMonitor;

//Contains Quick Sort logic
public class CropMonitorClass {

 // Quick Sort method
 public static void quickSort(SensorData[] data, int low, int high) {

     // Base condition
     if (low < high) {

         // Partition index
         int pivotIndex = partition(data, low, high);

         // Sort left part
         quickSort(data, low, pivotIndex - 1);

         // Sort right part
         quickSort(data, pivotIndex + 1, high);
     }
 }

 // Partition method based on timestamp
 private static int partition(SensorData[] data, int low, int high) {

     // Choosing last element as pivot
     long pivot = data[high].timestamp;

     int i = low - 1;

     // Compare each element with pivot
     for (int j = low; j < high; j++) {

         if (data[j].timestamp <= pivot) {
             i++;

             // Swap data[i] and data[j]
             SensorData temp = data[i];
             data[i] = data[j];
             data[j] = temp;
         }
     }

     // Place pivot at correct position
     SensorData temp = data[i + 1];
     data[i + 1] = data[high];
     data[high] = temp;

     return i + 1;
 }

 // Display method
 public static void displayData(SensorData[] data) {
     for (SensorData s : data) {
         s.display();
     }
 }
}
