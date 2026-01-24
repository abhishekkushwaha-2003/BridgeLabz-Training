package com.AnnotationsAndReflection.ReflectionProblem.BasicLevel.AccessPrivateField;

import java.lang.reflect.Field;

public class PersonMain {
    public static void main(String[] args) throws Exception {

        Person p = new Person();

        // get class object
        Class<?> cls = p.getClass();

        // access private field
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true); // allow private access

        // get old value
        System.out.println("Old Age: " + field.get(p));

        // change value
        field.set(p, 25);

        // get new value
        System.out.println("New Age: " + field.get(p));
    }
}
