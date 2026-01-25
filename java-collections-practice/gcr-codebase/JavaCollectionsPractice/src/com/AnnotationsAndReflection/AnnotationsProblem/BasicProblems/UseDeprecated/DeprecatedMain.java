package com.AnnotationsAndReflection.AnnotationsProblem.BasicProblems.UseDeprecated;

public class DeprecatedMain {
    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();
        api.oldFeature();   
        api.newFeature();
    }
}
