package com.FunctionalInterfaces.FunctionalInterfacesProblems;

import java.util.function.Predicate;

public class TemperatureAlertSystem {

    public static void main(String[] args) {

        double threshold = 40.0;

        Predicate<Double> isHighTemp = temp -> temp > threshold;

        double currentTemp = 45.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("ALERT! Temperature crossed threshold");
        } else {
            System.out.println("Temperature is normal");
        }
    }
}
