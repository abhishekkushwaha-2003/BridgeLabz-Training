package com.AnnotationsAndReflection.AnnotationsProblem.BeginnerLevel.TodoAnnotationforPendingTasks;

public class Project {

    @Todo(task = "Add login feature", assignedTo = "Abhishek", priority = "HIGH")
    public void login() {
        // pending
    }

    @Todo(task = "Improve UI", assignedTo = "Ravi")
    public void updateUI() {
        // pending
    }

    public void completedMethod() {
        System.out.println("Already done");
    }
}
