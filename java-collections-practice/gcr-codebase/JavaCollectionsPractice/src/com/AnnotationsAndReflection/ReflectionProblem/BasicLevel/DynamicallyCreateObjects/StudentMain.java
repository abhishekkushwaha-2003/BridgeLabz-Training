package com.AnnotationsAndReflection.ReflectionProblem.BasicLevel.DynamicallyCreateObjects;

import java.lang.reflect.Constructor;

public class StudentMain {
    public static void main(String[] args) throws Exception {

        // get class object
        Class<?> cls = Student.class;

        // get constructor
        Constructor<?> cons = cls.getConstructor(String.class);

        // create object dynamically
        Student s = (Student) cons.newInstance("Abhishek");

        // call method
        s.display();
    }
}
