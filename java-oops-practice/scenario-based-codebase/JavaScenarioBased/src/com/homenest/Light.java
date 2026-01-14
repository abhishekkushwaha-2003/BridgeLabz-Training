package com.homenest;

//Light device
public class Light extends Device {

 public Light(String deviceId) {
     super(deviceId, 5.0); // 5 units energy usage
 }

 // Polymorphism: different reset behavior
 @Override
 public void reset() {
     System.out.println("Light brightness reset to normal");
 }
}
