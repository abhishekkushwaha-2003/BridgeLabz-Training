package com.day5.Quicksort.CropMonitor;

//Represents one sensor reading
public class SensorData {

 int sensorId;        
 long timestamp;      
 double temperature;  

 // Constructor
 public SensorData(int sensorId, long timestamp, double temperature) {
     this.sensorId = sensorId;
     this.timestamp = timestamp;
     this.temperature = temperature;
 }

 // Display sensor details
 public void display() {
     System.out.println("Sensor ID: " + sensorId + ", Timestamp: " + timestamp + ", Temp: " + temperature + "°C");
 }
}
