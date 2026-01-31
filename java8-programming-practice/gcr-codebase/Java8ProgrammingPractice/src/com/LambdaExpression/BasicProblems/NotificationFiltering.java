package com.LambdaExpression.BasicProblems;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFiltering {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("CRITICAL", "Heart rate abnormal"),
                new Alert("INFO", "Appointment reminder"),
                new Alert("WARNING", "Blood pressure high")
        );

    
        Predicate<Alert> criticalOnly =
                alert -> alert.type.equals("CRITICAL");

        List<Alert> filteredAlerts = alerts.stream()
                .filter(criticalOnly)
                .collect(Collectors.toList());

        System.out.println(filteredAlerts);
    }
}
