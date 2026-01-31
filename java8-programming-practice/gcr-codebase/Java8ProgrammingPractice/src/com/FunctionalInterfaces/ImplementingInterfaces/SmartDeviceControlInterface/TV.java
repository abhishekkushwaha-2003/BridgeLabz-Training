package com.FunctionalInterfaces.ImplementingInterfaces.SmartDeviceControlInterface;

public class TV implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("TV turned ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned OFF");
    }
}
