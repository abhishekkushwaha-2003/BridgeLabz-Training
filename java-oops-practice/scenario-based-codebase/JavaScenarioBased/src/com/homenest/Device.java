package com.homenest;

//Parent class for all devices
public class Device implements IControllable {

 protected String deviceId;
 private boolean status;          // Encapsulation: cannot be changed directly
 protected double energyUsage;

 // Firmware update log (secured)
 protected String firmwareLog;

 // Constructor
 public Device(String deviceId, double energyUsage) {
     this.deviceId = deviceId;
     this.energyUsage = energyUsage;
     this.status = false;
     this.firmwareLog = "Firmware v1.0 installed";
 }

 // Getter (read-only access)
 public boolean isOn() {
     return status;
 }

 @Override
 public void turnOn() {
     status = true;
     System.out.println(deviceId + " turned ON");
 }

 @Override
 public void turnOff() {
     status = false;
     System.out.println(deviceId + " turned OFF");
 }

 // Default reset behavior
 @Override
 public void reset() {
     status = false;
     System.out.println(deviceId + " reset to default state");
 }

 // Energy calculation using operators
 public double calculateDailyEnergy(int hours) {
     return energyUsage * hours;
 }
}
