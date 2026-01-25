package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.CustomSerializationAnnotationJsonField;

public class JsonMain {
    public static void main(String[] args) throws Exception {

        User user = new User("Abhishek", 22);
        System.out.println(JsonConverter.toJson(user));
    }
}
