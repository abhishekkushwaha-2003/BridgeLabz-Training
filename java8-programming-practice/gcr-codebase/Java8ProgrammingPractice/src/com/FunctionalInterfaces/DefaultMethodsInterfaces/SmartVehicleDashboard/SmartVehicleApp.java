package com.FunctionalInterfaces.DefaultMethodsInterfaces.SmartVehicleDashboard;

public class SmartVehicleApp {
    public static void main(String[] args) {

        Vehicle v1 = new PetrolCar();
        Vehicle v2 = new ElectricCar();

        v1.displayBatteryStatus();
        v2.displayBatteryStatus();
    }
}
