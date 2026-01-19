package com.day6.MergeSort.FleetManager;

//Main class 
public class FleetManagerApp {

 public static void main(String[] args) {

     // Vehicles received from multiple depots (already sorted)
     Vehicle[] vehicles = {
         new Vehicle("DL-101", 12000),
         new Vehicle("MH-202", 15000),
         new Vehicle("KA-303", 18000),
         new Vehicle("TN-404", 22000),
         new Vehicle("GJ-505", 25000)
     };

     System.out.println("Before Master Scheduling:");
     FleetManagerClass.displayVehicles(vehicles);

     // Merge Sort to create master maintenance list
     FleetManagerClass.mergeSort(vehicles, 0, vehicles.length - 1);

     System.out.println("\nMaster Maintenance Schedule (Sorted by Mileage):");
     FleetManagerClass.displayVehicles(vehicles);
 }
}
