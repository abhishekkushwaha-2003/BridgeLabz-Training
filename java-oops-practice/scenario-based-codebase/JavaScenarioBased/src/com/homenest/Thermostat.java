package com.homenest;

//Thermostat device
public class Thermostat extends Device {

 public Thermostat(String deviceId) {
     super(deviceId, 12.0);
 }

 @Override
 public void reset() {
     System.out.println("Thermostat temperature reset to 24°C");
 }
}
