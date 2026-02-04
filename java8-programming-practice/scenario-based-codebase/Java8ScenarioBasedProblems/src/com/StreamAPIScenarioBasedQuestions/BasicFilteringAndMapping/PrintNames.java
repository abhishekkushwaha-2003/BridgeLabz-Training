package com.StreamAPIScenarioBasedQuestions.BasicFilteringAndMapping;

public class PrintNames {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .map(Student::getName)
            .forEach(System.out::println);
    }
}
