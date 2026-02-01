package com.StreamAPI.forEachMethod;

import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {

        List<Double> readings =
                Arrays.asList(22.5, 30.2, 18.4, 35.1, 27.9);

        double threshold = 25.0;

        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r ->
                        System.out.println("High Reading: " + r));
    }
}
