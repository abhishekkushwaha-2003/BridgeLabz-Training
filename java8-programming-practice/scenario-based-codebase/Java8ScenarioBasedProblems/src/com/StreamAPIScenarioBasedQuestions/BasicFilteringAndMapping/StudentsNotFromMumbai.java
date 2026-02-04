package com.StreamAPIScenarioBasedQuestions.BasicFilteringAndMapping;

public class StudentsNotFromMumbai {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .filter(s -> !s.getCity().equals("Mumbai"))
            .forEach(System.out::println);
    }
}
