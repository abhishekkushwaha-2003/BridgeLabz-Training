package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.MethodExecutionTiming;

public class Task {

    public void process() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Task completed");
    }
}
