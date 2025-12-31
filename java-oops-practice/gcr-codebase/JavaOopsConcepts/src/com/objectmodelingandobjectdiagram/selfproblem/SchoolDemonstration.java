package com.objectmodelingandobjectdiagram.selfproblem;
public class SchoolDemonstration {
    public static void main(String[] args) {

        // creating school
        School school = new School("Green Valley School");

        // creating students
        Student s1 = new Student("Rohan");
        Student s2 = new Student("Neha");

        // creating courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Computer Science");

        // adding students to school (aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // enrolling students in courses (association)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        s2.enrollCourse(c2);

        // viewing data
        System.out.println();
        s1.viewCourses();

        System.out.println();
        c2.showStudents();
    }
}
