package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.CreateRepeatableAnnotation;

public class Project {

    @BugReport(description = "Null pointer issue")
    @BugReport(description = "Performance issue")
    public void runProject() {
        System.out.println("Project running");
    }
}
