package com.StreamAPIScenarioBasedQuestions.BasicFilteringAndMapping;

public class StudentsMechanicalEngineering {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .filter(s -> s.getDepartment().equals("Mechanical"))
            .forEach(System.out::println);
    }
}
