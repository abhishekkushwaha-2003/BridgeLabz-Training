package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.CreateCustomAnnotation;

public class TaskManager {

    @TaskInfo(priority = "High", assignedTo = "Abhishek")
    public void completeTask() {
        System.out.println("Task completed");
    }
}

