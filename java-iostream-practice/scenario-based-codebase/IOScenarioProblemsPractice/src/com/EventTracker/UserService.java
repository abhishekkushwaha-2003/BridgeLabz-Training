package com.EventTracker;

public class UserService {

    @AuditTrail(action = "USER_LOGIN")
    public void login() {
        System.out.println("User logged in");
    }

    @AuditTrail(action = "FILE_UPLOAD")
    public void uploadFile() {
        System.out.println("File uploaded");
    }

    public void helperMethod() {
        System.out.println("No audit needed");
    }
}
