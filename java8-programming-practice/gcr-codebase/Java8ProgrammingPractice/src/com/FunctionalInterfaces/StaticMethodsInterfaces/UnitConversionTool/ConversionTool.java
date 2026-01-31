package com.FunctionalInterfaces.StaticMethodsInterfaces.UnitConversionTool;

public class ConversionTool {
    public static void main(String[] args) {

        System.out.println("10 km = " + UnitConverter.kmToMiles(10) + " miles");
        System.out.println("5 kg = " + UnitConverter.kgToPounds(5) + " lbs");
    }
}
