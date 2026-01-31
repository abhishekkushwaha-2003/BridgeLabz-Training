package com.FunctionalInterfaces.StaticMethodsInterfaces.UnitConversionTool;

public interface UnitConverter {

    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double kgToPounds(double kg) {
        return kg * 2.20462;
    }
}
