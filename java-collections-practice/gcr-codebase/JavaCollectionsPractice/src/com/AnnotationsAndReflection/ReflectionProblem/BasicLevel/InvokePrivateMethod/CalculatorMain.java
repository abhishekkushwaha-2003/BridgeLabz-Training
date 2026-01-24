package com.AnnotationsAndReflection.ReflectionProblem.BasicLevel.InvokePrivateMethod;

import java.lang.reflect.Method;

public class CalculatorMain {
    public static void main(String[] args) throws Exception {

        Calculator calc = new Calculator();

        // get class object
        Class<?> cls = calc.getClass();

        // get private method
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true); 

        // invoke method
        int result = (int) method.invoke(calc, 4, 5);

        System.out.println("Result: " + result);
    }
}
