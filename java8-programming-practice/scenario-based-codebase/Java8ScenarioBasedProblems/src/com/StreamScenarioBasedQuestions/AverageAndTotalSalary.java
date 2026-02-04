package com.StreamScenarioBasedQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class AverageAndTotalSalary {
    public static void main(String[] args) {
        DoubleSummaryStatistics stats =
            EmployeeData.getEmployees().stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Average: " + stats.getAverage());
        System.out.println("Total: " + stats.getSum());
    }
}

