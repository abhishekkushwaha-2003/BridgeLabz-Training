package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.UseDeprecated;

public class LegacyAPI {

    @Deprecated
    public void oldFeature() {
        System.out.println("Old feature (do not use)");
    }

    public void newFeature() {
        System.out.println("New feature");
    }
}
