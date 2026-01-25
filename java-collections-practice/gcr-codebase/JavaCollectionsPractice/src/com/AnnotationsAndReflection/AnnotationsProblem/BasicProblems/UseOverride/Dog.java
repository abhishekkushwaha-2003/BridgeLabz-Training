package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.UseOverride;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}
