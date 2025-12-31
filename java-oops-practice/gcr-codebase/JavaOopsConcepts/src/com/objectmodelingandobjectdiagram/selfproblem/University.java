package com.objectmodelingandobjectdiagram.selfproblem;

import java.util.ArrayList;

public class University {

    // university name
    String universityName;

    // composition: departments belong to university
    ArrayList<Department> departments = new ArrayList<>();

    // aggregation: faculty members (independent)
    ArrayList<Faculty> facultyMembers = new ArrayList<>();

    // constructor
    University(String universityName) {
        this.universityName = universityName;
    }

    // method to add department
    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // method to add faculty
    void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // method to show university details
    void showUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("\nDepartments:");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("\nFaculty Members:");
        for (Faculty f : facultyMembers) {
            f.showFaculty();
        }
    }
}
