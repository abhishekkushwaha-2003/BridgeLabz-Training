package com.StreamAPIScenarioBasedQuestions.GroupingAndAggregation;

import java.util.*;
import java.util.stream.*;

public class DepartmentWithHighestAverageRank {
    public static void main(String[] args) {

        Map.Entry<String, Double> result =
            StudentData.getStudents().stream()
                .collect(Collectors.groupingBy(
                    Student::getDepartment,
                    Collectors.averagingInt(Student::getRank)
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println("Department with highest avg rank:");
        System.out.println(result.getKey() + " -> " + result.getValue());
    }
}
