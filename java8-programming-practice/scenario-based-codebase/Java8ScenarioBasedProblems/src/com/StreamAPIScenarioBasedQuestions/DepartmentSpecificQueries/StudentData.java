package com.StreamAPIScenarioBasedQuestions.DepartmentSpecificQueries;

import java.util.*;

public class StudentData {
    public static List<Student> getStudents() {
        return Arrays.asList(
            new Student(1,"Abhishek",22,"Male","Mumbai","Maharashtra","ComputerScience",45,Arrays.asList("1117845692","2542165822")),
            new Student(2,"Amit",26,"Male","Delhi","Delhi","ComputerScience",120,Arrays.asList("3856974233")),
            new Student(3,"Sneha",24,"Female","Pune","Maharashtra","Electronics",30,Arrays.asList("4523148644","5558759632")),
            new Student(4,"Rashi",21,"Female","Mumbai","Maharashtra", "ComputerScience",75,Arrays.asList("6667896542")),
            new Student(5,"Karan",21,"Male","Bangalore","Karnataka","Mechanical",15,Arrays.asList("7785412367","8889876548")),
            new Student(6,"Palak",20,"Female","Chennai","TamilNadu", "Biotech",60,Arrays.asList("9952369879")),
            new Student(7,"Raj",23,"Male","Bangalore","Karnataka","Electronics",90,Arrays.asList("1054789561")),
            new Student(8,"Simran",25,"Female","Delhi","Delhi", "Biotech",10,Arrays.asList("2022145987","3589632503"))
        );
    }
}
