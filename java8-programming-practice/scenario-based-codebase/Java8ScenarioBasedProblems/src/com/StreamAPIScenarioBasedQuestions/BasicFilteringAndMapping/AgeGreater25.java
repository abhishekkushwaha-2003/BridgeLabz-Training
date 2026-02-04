package com.StreamAPIScenarioBasedQuestions.BasicFilteringAndMapping;

public class AgeGreater25 {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .filter(s -> s.getAge() > 25)
            .forEach(System.out::println);
    }
}
