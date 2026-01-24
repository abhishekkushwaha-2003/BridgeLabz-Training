package com.AnnotationsAndReflection.ReflectionProblem.IntermediateLevel.DynamicMethodInvocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class MathOperationsMain {
    public static void main(String[] args) throws Exception {

        MathOperations obj = new MathOperations();
        Class<?> cls = obj.getClass();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name (add / subtract / multiply): ");
        String methodName = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // get method dynamically
        Method method = cls.getMethod(methodName, int.class, int.class);

        // invoke method
        int result = (int) method.invoke(obj, a, b);

        System.out.println("Result: " + result);
        sc.close();
    }
}
