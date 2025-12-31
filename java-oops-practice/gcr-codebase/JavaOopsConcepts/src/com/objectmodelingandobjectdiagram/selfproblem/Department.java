package com.objectmodelingandobjectdiagram.selfproblem;

import java.util.ArrayList;

public class Department {

    // department name
    String deptName;

    // list of faculty working in department
    ArrayList<Faculty> facultyList = new ArrayList<>();

    // constructor
    Department(String deptName) {
        this.deptName = deptName;
    }

    // method to add faculty to department
    void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    // method to display department details
    void showDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyList) {
            f.showFaculty();
        }
    }
}

