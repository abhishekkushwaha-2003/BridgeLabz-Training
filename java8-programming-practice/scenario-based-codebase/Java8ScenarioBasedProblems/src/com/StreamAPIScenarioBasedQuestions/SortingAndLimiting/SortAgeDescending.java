package com.StreamAPIScenarioBasedQuestions.SortingAndLimiting;

import java.util.*;

public class SortAgeDescending {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .sorted(Comparator.comparing(Student::getAge).reversed())
            .forEach(System.out::println);
    }
}
