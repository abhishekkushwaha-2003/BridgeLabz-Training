package com.FunctionalInterfaces.ImplementingInterfaces.SmartDeviceControlInterface;

public class SmartDeviceControl {
    public static void main(String[] args) {

        SmartDevice d1 = new Light();
        SmartDevice d2 = new AC();
        SmartDevice d3 = new TV();

        d1.turnOn();
        d2.turnOn();
        d3.turnOff();
    }
}
