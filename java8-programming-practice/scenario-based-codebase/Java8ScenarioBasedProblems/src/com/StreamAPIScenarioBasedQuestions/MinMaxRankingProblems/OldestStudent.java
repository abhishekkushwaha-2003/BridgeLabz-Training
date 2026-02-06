package com.StreamAPIScenarioBasedQuestions.MinMaxRankingProblems;

import java.util.*;

public class OldestStudent {
    public static void main(String[] args) {

        Student oldest =
            StudentData.getStudents().stream()
                .max(Comparator.comparing(Student::getAge))
                .get();

        System.out.println(oldest);
    }
    
    public class StudentData {
        public static List<Student> getStudents() {
            return Arrays.asList(
                new Student(1,"Abhishek",22,"Male","Mumbai","ComputerScience",45,Arrays.asList("1117845692","2542165822")),
                new Student(2,"Amit",26,"Male","Delhi","ComputerScience",120,Arrays.asList("3856974233")),
                new Student(3,"Sneha",24,"Female","Pune","Electronics",30,Arrays.asList("4523148644","5558759632")),
                new Student(4,"Rashi",21,"Female","Mumbai","ComputerScience",75,Arrays.asList("6667896542")),
                new Student(5,"Karan",21,"Male","Bangalore","Mechanical",15,Arrays.asList("7785412367","8889876548")),
                new Student(6,"Palak",20,"Female","Chennai","Biotech",60,Arrays.asList("9952369879")),
                new Student(7,"Raj",23,"Male","Bangalore","Mechanical",90,Arrays.asList("1054789561")),
                new Student(8,"Simran",25,"Female","Delhi","Electronics",10,Arrays.asList("2022145987","3589632503"))
            );
        }
    }
}
