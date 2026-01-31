package com.FunctionalInterfaces.DefaultMethodsInterfaces.SmartVehicleDashboard;

public class ElectricCar implements Vehicle {

    @Override
    public void displaySpeed() {
        System.out.println("Speed: 70 km/h");
    }

    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery: 85%");
    }
}
