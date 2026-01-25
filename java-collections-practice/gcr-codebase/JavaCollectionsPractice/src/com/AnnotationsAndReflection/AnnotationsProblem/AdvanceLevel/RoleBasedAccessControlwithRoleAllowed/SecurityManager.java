package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.RoleBasedAccessControlwithRoleAllowed;

import java.lang.reflect.Method;

public class SecurityManager {

    public static void invoke(Object obj, String methodName, String role) throws Exception {

        Method method = obj.getClass().getMethod(methodName);

        if (method.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);

            if (!roleAllowed.value().equals(role)) {
                System.out.println("Access Denied!");
                return;
            }
        }

        method.invoke(obj);
    }
}
