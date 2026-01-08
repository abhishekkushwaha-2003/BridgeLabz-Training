package com.parkease;

//Abstract base class representing a vehicle
public abstract class Vehicle implements IPayable {

 // Vehicle number
 protected String vehicleNumber;

 // Base rate per hour for parking
 protected double baseRate;

 // Constructor to initialize vehicle details
 public Vehicle(String vehicleNumber, double baseRate) {
     this.vehicleNumber = vehicleNumber;
     this.baseRate = baseRate;
 }
}
