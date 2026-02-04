package com.StreamAPIScenarioBasedQuestions.GroupingAndAggregation;

import java.util.stream.*;

public class AverageRank {
    public static void main(String[] args) {

        System.out.println(
            StudentData.getStudents().stream()
                .collect(Collectors.groupingBy(
                    Student::getGender,
                    Collectors.averagingInt(Student::getRank)
                ))
        );
    }
}
