package com.day5.Quicksort.CropMonitor;

//Program execution starts here
public class CropMonitorApp {

 public static void main(String[] args) {

     // Unordered sensor readings
     SensorData[] readings = {
         new SensorData(1, 1705402100L, 28.5),
         new SensorData(2, 1705401100L, 26.8),
         new SensorData(3, 1705403100L, 29.1),
         new SensorData(4, 1705400100L, 25.4),
         new SensorData(5, 1705401500L, 27.0)
     };

     System.out.println("Before Sorting:");
     CropMonitorClass.displayData(readings);

     // Quick Sort by timestamp
     CropMonitorClass.quickSort(readings, 0, readings.length - 1);

     System.out.println("\nAfter Sorting (By Timestamp):");
     CropMonitorClass.displayData(readings);
 }
}
