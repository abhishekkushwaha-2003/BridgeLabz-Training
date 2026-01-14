package com.homenest;

//Smart Lock device
public class Lock extends Device {

 public Lock(String deviceId) {
     super(deviceId, 2.0);
 }

 @Override
 public void reset() {
     System.out.println("Lock security settings reset");
 }
}
