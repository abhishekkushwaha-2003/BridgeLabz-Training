package com.AnnotationsAndReflection.AnnotationsProblem.BeginnerLevel.AnnotationToMarkImportantMethods;

public class Service {

    @ImportantMethod
    public void saveData() {
        System.out.println("Saving data...");
    }

    @ImportantMethod(level = "LOW")
    public void logData() {
        System.out.println("Logging data...");
    }

    public void normalMethod() {
        System.out.println("Normal method");
    }
}

