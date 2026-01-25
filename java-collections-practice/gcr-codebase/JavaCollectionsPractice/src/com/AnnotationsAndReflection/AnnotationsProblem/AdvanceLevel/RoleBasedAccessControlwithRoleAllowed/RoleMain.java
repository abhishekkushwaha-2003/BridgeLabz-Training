package com.AnnotationsAndReflection.AnnotationsProblem.AdvanceLevel.RoleBasedAccessControlwithRoleAllowed;

public class RoleMain{
    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();

        System.out.println("Trying as USER:");
        SecurityManager.invoke(service, "deleteUser", "USER");

        System.out.println("\nTrying as ADMIN:");
        SecurityManager.invoke(service, "deleteUser", "ADMIN");
    }
}
