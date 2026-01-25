package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.MethodExecutionTiming;

import java.lang.reflect.Method;

public class TimingUtil {

    public static void execute(Object obj, String methodName) throws Exception {

        Class<?> cls = obj.getClass();
        Method method = cls.getMethod(methodName);

        long start = System.currentTimeMillis();
        method.invoke(obj);
        long end = System.currentTimeMillis();

        System.out.println("Execution Time: " + (end - start) + " ms");
    }
}
