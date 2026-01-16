package com.day4.bubblesort.HospitalQueue;

public class HospitalQueue {

    // Bubble Sort based on criticality (high to low)
    public static void bubbleSortByCriticality(Patient[] patients) {

        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Swap if current patient is less critical
                if (patients[j].criticality < patients[j + 1].criticality) {

                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    // Display patient list
    public static void displayPatients(Patient[] patients) {
        for (Patient p : patients) {
            p.display();
        }
    }

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Rahul", 1, 4),
            new Patient("Sita", 2, 9),
            new Patient("Abhishek", 3, 6),
            new Patient("Neha", 4, 10),
            new Patient("Rahul", 5, 3)
        };

        System.out.println("Before Sorting:");
        displayPatients(patients);

        bubbleSortByCriticality(patients);

        System.out.println("\nAfter Sorting by Criticality:");
        displayPatients(patients);
    }
}
