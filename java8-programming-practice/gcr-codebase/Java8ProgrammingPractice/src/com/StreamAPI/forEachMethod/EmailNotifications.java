package com.StreamAPI.forEachMethod;

import java.util.*;

public class EmailNotifications {

    static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }

    public static void main(String[] args) {

        List<String> emails =
                Arrays.asList("abhi@gmail.com", "rashi@gmail.com", "palak@gmail.com");

        emails.forEach(email ->
                sendEmailNotification(email));
    }
}
