package com.AnnotationsAndReflection.AnnotationsProblem.IntermediateLevel.LoggingMethodExecutionTime;

import java.lang.reflect.Method;

public class ExecutionTimeMain {
    public static void main(String[] args) throws Exception {

        Work work = new Work();
        Class<?> cls = work.getClass();

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

            	// start time
                long startTime = System.nanoTime(); 
                // method call
                method.invoke(work); 
                // end time
                long endTime = System.nanoTime();  

                long timeTaken = endTime - startTime;

                System.out.println(
                        method.getName() + " executed in " + timeTaken + " ns"
                );
                System.out.println();
            }
        }
    }
}
