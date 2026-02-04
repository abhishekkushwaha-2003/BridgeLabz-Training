package com.StreamAPIScenarioBasedQuestions.SortingAndLimiting;

import java.util.*;

public class Top5Students {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .sorted(Comparator.comparing(Student::getRank))
            .limit(5)
            .forEach(System.out::println);
    }
}
