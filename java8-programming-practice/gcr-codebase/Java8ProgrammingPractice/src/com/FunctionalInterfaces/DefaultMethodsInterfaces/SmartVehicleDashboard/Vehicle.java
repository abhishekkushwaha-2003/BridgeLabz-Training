package com.FunctionalInterfaces.DefaultMethodsInterfaces.SmartVehicleDashboard;

public interface Vehicle {

    void displaySpeed();

    default void displayBatteryStatus() {
        System.out.println("Battery status not available");
    }
}
