package com.FunctionalInterfaces.FunctionalInterfacesProblems;

import java.util.function.Function;

public class StringLengthChecker {

    public static void main(String[] args) {

        int maxLimit = 20;

        Function<String, Integer> lengthFinder = msg -> msg.length();

        String message = "Java Functional Interface";

        int length = lengthFinder.apply(message);

        if (length > maxLimit) {
            System.out.println("Message exceeds character limit");
        } else {
            System.out.println("Message is within limit");
        }
    }
}
