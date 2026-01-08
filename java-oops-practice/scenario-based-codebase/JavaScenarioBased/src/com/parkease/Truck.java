package com.parkease;

//Truck class extending Vehicle
public class Truck extends Vehicle {

 // Constructor for Truck
 public Truck(String vehicleNumber) {
     super(vehicleNumber, 100);
 }

 // Charge calculation for Truck
 @Override
 public double calculateCharges(int hours) {

     double amount = baseRate * hours;

     // Heavy vehicle penalty if over time
     if (hours > 3) {
         amount += 200;
     }

     return amount;
 }
}
