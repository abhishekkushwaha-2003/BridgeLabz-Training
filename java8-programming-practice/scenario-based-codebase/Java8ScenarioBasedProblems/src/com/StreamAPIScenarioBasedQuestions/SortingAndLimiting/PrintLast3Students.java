package com.StreamAPIScenarioBasedQuestions.SortingAndLimiting;
import java.util.*;

public class PrintLast3Students {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .sorted(Comparator.comparing(Student::getRank).reversed())
            .limit(3)
            .forEach(System.out::println);
    }
}
