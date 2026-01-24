package com.AnnotationsAndReflection.ReflectionProblem.BasicLevel;

import java.lang.reflect.*;

public class GetClassInformation {
    public static void main(String[] args) throws Exception {

        // taking class name directly (can also use Scanner)
        String className = "java.lang.String";

        // get Class object
        Class<?> cls = Class.forName(className);

        System.out.println("Class Name: " + cls.getName());

        // get methods
        Method[] methods = cls.getDeclaredMethods();
        System.out.println("\nMethods:");
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        // get fields
        Field[] fields = cls.getDeclaredFields();
        System.out.println("\nFields:");
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        // get constructors
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        System.out.println("\nConstructors:");
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }
    }
}
