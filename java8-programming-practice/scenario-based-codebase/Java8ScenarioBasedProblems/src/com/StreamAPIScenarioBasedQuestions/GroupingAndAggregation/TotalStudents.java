package com.StreamAPIScenarioBasedQuestions.GroupingAndAggregation;

public class TotalStudents {
    public static void main(String[] args) {

        long totalStudents =
            StudentData.getStudents().stream().count();

        System.out.println("Total Students = " + totalStudents);
    }
}
