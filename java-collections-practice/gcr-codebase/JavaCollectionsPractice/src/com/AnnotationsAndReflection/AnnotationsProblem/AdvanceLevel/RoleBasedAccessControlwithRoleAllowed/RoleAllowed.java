package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.RoleBasedAccessControlwithRoleAllowed;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface RoleAllowed {
    String value();
}
