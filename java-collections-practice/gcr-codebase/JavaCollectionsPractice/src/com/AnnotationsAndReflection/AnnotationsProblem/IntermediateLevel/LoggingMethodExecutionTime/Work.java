package com.AnnotationsAndReflection.AnnotationsProblem.IntermediateLevel.LoggingMethodExecutionTime;

public class Work {

    @LogExecutionTime
    public void taskOne() throws InterruptedException {
        Thread.sleep(200);
        System.out.println("Task One completed");
    }

    @LogExecutionTime
    public void taskTwo() throws InterruptedException {
        Thread.sleep(400);
        System.out.println("Task Two completed");
    }
}
