package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.CustomSerializationAnnotationJsonField;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JsonField {
    String name();
}
