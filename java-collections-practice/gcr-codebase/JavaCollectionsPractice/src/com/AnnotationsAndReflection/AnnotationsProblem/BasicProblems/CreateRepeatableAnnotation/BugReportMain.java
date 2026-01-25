package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.CreateRepeatableAnnotation;

import java.lang.reflect.Method;

public class BugReportMain {
    public static void main(String[] args) throws Exception {

        Method method = Project.class.getMethod("runProject");

        BugReport[] reports = method.getAnnotationsByType(BugReport.class);

        for (BugReport report : reports) {
            System.out.println("Bug: " + report.description());
        }
    }
}
