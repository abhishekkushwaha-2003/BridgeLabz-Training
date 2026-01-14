package com.homenest;

//Main class to test HomeNest system
public class HomeNestApp {

 public static void main(String[] args) {

     Device light = new Light("Light-101");
     Device camera = new Camera("Cam-202");
     Device thermostat = new Thermostat("Thermo-303");
     Device lock = new Lock("Lock-404");

     light.turnOn();
     camera.turnOn();

     System.out.println("Light energy usage: " + light.calculateDailyEnergy(6));
     System.out.println("Camera energy usage: " + camera.calculateDailyEnergy(4));

     // Polymorphism in action
     light.reset();
     camera.reset();
     thermostat.reset();
     lock.reset();
 }
}
