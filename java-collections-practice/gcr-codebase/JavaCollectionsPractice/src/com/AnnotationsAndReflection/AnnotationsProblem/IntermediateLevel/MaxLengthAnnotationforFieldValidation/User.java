package com.AnnotationsAndReflection.AnnotationsProblem.IntermediateLevel.MaxLengthAnnotationforFieldValidation;

import java.lang.reflect.Field;

public class User {

    @MaxLength(10)
    private String username;

    public User(String username) {

        try {
            Field field = this.getClass().getDeclaredField("username");
            MaxLength max = field.getAnnotation(MaxLength.class);

            if (max != null && username.length() > max.value()) {
                throw new IllegalArgumentException(
                        "Username length should be max " + max.value()
                );
            }

            this.username = username;

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void show() {
        System.out.println("Username: " + username);
    }
}
