package com.StreamAPI.forEachMethod;

import java.util.*;

public class EventWelcomeMessage {
    public static void main(String[] args) {

        List<String> attendees =
                Arrays.asList("Abhi", "Rahul", "Sonu", "Palak");

        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!"));
    }
}
