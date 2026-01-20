package com.ExceptionHandling.ExceptionPropagationInMethods;

class ExceptionPropagation {

    // This method throws ArithmeticException
    static void method1() {
        int result = 10 / 0;   // Exception occurs here
        System.out.println(result);
    }

    // This method calls method1()
    static void method2() {
        method1();            // Exception propagates from here
    }

    public static void main(String[] args) {

        try {
            // Call method2()
            method2();
        }
        // Exception is handled here
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
