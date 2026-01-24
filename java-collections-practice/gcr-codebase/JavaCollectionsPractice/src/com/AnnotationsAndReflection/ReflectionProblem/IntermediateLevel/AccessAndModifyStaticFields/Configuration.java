package com.AnnotationsAndReflection.ReflectionProblem.IntermediateLevel.AccessAndModifyStaticFields;

public class Configuration {

    private static String API_KEY = "OLD_KEY";

    public static void showKey() {
        System.out.println("API KEY: " + API_KEY);
    }
}

