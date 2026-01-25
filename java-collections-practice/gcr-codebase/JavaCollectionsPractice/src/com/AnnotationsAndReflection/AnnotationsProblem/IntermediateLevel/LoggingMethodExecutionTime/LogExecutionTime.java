package com.AnnotationsAndReflection.AnnotationsProblem.IntermediateLevel.LoggingMethodExecutionTime;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface LogExecutionTime {
    // marker annotation
}

