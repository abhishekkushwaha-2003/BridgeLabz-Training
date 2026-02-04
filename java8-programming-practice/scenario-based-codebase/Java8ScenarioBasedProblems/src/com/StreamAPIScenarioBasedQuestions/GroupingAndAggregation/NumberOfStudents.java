package com.StreamAPIScenarioBasedQuestions.GroupingAndAggregation;

import java.util.stream.*;

public class NumberOfStudents {
    public static void main(String[] args) {

        System.out.println(
            StudentData.getStudents().stream()
                .collect(Collectors.groupingBy(
                    Student::getDepartment,
                    Collectors.counting()
                ))
        );
    }
}
