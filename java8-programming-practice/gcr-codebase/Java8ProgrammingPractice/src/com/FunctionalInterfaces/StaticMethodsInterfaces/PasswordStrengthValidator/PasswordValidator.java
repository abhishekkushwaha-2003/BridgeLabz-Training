package com.FunctionalInterfaces.StaticMethodsInterfaces.PasswordStrengthValidator;

public class PasswordValidator {
    public static void main(String[] args) {

        String pwd = "Secure123";

        if (SecurityUtils.isStrongPassword(pwd)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}
