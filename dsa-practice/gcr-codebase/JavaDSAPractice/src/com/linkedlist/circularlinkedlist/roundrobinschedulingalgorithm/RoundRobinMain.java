package com.linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;
public class RoundRobinMain {

    public static void main(String[] args) {

        // time quantum
        int timeQuantum = 4;

        // scheduler object
        RoundRobinScheduler scheduler = new RoundRobinScheduler();

        // adding processes
        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        System.out.println("Starting Round Robin Scheduling");
        System.out.println("------------------");

        // start scheduling
        scheduler.schedule(timeQuantum);
    }
}
