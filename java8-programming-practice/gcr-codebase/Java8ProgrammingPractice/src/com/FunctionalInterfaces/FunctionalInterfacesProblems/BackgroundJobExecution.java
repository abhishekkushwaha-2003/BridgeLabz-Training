package com.FunctionalInterfaces.FunctionalInterfacesProblems;

public class BackgroundJobExecution {

    public static void main(String[] args) {

        Runnable job = () -> {
            System.out.println("Background job started...");
            System.out.println("Processing data...");
            System.out.println("Background job finished");
        };

        Thread t = new Thread(job);
        t.start();
    }
}

