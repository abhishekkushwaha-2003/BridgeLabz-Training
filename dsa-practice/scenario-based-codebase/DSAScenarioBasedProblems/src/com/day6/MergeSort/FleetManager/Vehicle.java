package com.day6.MergeSort.FleetManager;

//Represents a vehicle in the fleet
public class Vehicle {

 String vehicleId;   // Unique vehicle ID
 int mileage;        // Mileage in kilometers

 // Constructor
 public Vehicle(String vehicleId, int mileage) {
     this.vehicleId = vehicleId;
     this.mileage = mileage;
 }

 // Display vehicle details
 public void display() {
     System.out.println(
         "Vehicle ID: " + vehicleId +
         ", Mileage: " + mileage + " km"
     );
 }
}
