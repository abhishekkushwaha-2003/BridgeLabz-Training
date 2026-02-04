package com.StreamAPIScenarioBasedQuestions.SortingAndLimiting;

import java.util.*;

public class SortedByNameAndRank {
    public static void main(String[] args) {

        StudentData.getStudents().stream()
            .sorted(
                Comparator.comparing(Student::getName)
                          .thenComparing(Student::getRank)
            )
            .forEach(System.out::println);
    }
}
