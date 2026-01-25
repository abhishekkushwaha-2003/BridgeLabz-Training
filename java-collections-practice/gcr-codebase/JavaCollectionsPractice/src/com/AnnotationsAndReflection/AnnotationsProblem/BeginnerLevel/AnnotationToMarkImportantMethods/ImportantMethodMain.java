package com.AnnotationsAndReflection.AnnotationsProblem.BeginnerLevel.AnnotationToMarkImportantMethods;

import java.lang.reflect.Method;

public class ImportantMethodMain {
    public static void main(String[] args) {

        Class<Service> cls = Service.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod imp = method.getAnnotation(ImportantMethod.class);

                System.out.println("Method Name: " + method.getName());
                System.out.println("Level: " + imp.level());
                System.out.println();
            }
        }
    }
}

