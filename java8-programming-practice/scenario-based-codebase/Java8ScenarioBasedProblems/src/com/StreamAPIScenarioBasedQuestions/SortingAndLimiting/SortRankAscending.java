package com.StreamAPIScenarioBasedQuestions.SortingAndLimiting;

import java.util.*;

public class SortRankAscending {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .sorted(Comparator.comparing(Student::getRank))
            .forEach(System.out::println);
    }
}
