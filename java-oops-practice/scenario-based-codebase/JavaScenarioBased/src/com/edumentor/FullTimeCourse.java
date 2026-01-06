package com.edumentor;

public class FullTimeCourse implements ICertifiable {

    @Override
    public void generateCertificate() {
        System.out.println("Generating DETAILED certificate for Full-Time Course.");
    }
}