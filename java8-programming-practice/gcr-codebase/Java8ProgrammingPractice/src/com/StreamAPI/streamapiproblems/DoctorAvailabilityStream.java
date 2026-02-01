package com.StreamAPI.streamapiproblems;

import java.util.*;
import java.util.stream.Collectors;

class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    boolean isWeekendAvailable() { return weekendAvailable; }
    String getSpecialty() { return specialty; }

    public String toString() {
        return name + " - " + specialty;
    }
}

public class DoctorAvailabilityStream {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Abhishek", "Cardiology", true),
                new Doctor("Dr. Sonu", "Neurology", false),
                new Doctor("Dr. Rahul", "Orthopedic", true),
                new Doctor("Dr. Rajeev", "Dermatology", true)
        );

        doctors.stream()
                .filter(Doctor::isWeekendAvailable)
                .sorted(Comparator.comparing(Doctor::getSpecialty))
                .forEach(System.out::println);
    }
}

