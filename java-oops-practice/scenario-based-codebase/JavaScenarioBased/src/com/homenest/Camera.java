package com.homenest;

//Camera device
public class Camera extends Device {

 public Camera(String deviceId) {
     super(deviceId, 8.0);
 }

 @Override
 public void reset() {
     System.out.println("Camera angle reset to default");
 }
}
