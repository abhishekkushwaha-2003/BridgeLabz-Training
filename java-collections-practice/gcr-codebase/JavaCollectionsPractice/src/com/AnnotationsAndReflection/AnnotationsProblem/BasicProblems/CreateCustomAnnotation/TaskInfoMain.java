package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.CreateCustomAnnotation;

import java.lang.reflect.Method;

public class TaskInfoMain {
    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();
        Method method = manager.getClass().getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo info = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + info.priority());
            System.out.println("Assigned To: " + info.assignedTo());
        }

        manager.completeTask();
    }
}

