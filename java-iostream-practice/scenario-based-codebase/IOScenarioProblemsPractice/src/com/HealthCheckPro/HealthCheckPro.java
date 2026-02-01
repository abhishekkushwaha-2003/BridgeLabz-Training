package com.HealthCheckPro;

import java.lang.reflect.Method;

public class HealthCheckPro {
    public static void main(String[] args) {

        Class<?> cls = LabController.class;

        for (Method m : cls.getDeclaredMethods()) {
            if (!m.isAnnotationPresent(PublicAPI.class)
                && !m.isAnnotationPresent(RequiresAuth.class)) {

                System.out.println("Missing annotation on: " + m.getName());
            } else {
                System.out.println("API Method: " + m.getName());
            }
        }
    }
}
