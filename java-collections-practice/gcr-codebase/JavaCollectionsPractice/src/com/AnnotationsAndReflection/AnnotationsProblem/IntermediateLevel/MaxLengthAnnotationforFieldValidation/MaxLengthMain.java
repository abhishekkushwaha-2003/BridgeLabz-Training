package com.AnnotationsAndReflection.AnnotationsProblem.IntermediateLevel.MaxLengthAnnotationforFieldValidation;

public class MaxLengthMain {
    public static void main(String[] args) {

        User user1 = new User("Abhishek");
        user1.show();

        // this will throw exception
        User user2 = new User("VeryLongUsername123");
        user2.show();
    }
}

