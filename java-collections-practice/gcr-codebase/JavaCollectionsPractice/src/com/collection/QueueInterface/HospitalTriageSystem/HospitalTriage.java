package com.collection.QueueInterface.HospitalTriageSystem;

import java.util.PriorityQueue;
public class HospitalTriage {

    public static void main(String[] args) {

      // PriorityQueue with custom priority
        PriorityQueue<Patient> pq =
            new PriorityQueue<>(
                (p1, p2) -> p2.severity - p1.severity
            );

        //Adding patients
        pq.add(new Patient("Rajeev", 3));
        pq.add(new Patient("Abhishek", 5));
        pq.add(new Patient("Rahul", 2));

        //  Treat patients based on priority
        while (!pq.isEmpty()) {
            System.out.println(pq.remove().name);
        }
    }
}