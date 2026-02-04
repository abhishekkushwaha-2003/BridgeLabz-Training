package com.StreamAPIScenarioBasedQuestions.SortingAndLimiting;

import java.util.*;

public class StudentData {
    public static List<Student> getStudents() {
        return Arrays.asList(
            new Student(1,"Abhishek",22,"Male","Mumbai","ComputerScience",45,Arrays.asList("111","222")),
            new Student(2,"Amit",26,"Male","Delhi","ComputerScience",120,Arrays.asList("333")),
            new Student(3,"Sneha",24,"Female","Pune","Electronics",30,Arrays.asList("444","555")),
            new Student(4,"Rashi",21,"Female","Mumbai","ComputerScience",75,Arrays.asList("666")),
            new Student(5,"Karan",21,"Male","Bangalore","Mechanical",15,Arrays.asList("777","888")),
            new Student(6,"Palak",20,"Female","Chennai","Biotech",60,Arrays.asList("999")),
            new Student(7,"Raj",23,"Male","Bangalore","Mechanical",90,Arrays.asList("101")),
            new Student(8,"Simran",25,"Female","Delhi","Electronics",10,Arrays.asList("202","303"))
        );
    }
}

