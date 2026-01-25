package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.RoleBasedAccessControlwithRoleAllowed;

public class AdminService {

    @RoleAllowed("ADMIN")
    public void deleteUser() {
        System.out.println("User deleted successfully");
    }
}
