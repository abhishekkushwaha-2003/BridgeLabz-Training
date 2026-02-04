package com.StreamAPIScenarioBasedQuestions.BasicFilteringAndMapping;

public class RankBelow50 {
    public static void main(String[] args) {
        StudentData.getStudents().stream()
            .filter(s -> s.getRank() < 50)
            .forEach(System.out::println);
    }
}

