package com.AnnotationsAndReflection.ReflectionProblem.AdvancedLevel.GenerateSONRepresentation;

public class JsonMain {
    public static void main(String[] args) throws Exception {

        Student s = new Student("Abhishek", 85);
        System.out.println(JsonUtil.toJson(s));
    }
}
