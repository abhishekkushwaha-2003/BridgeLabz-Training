package com.FunctionalInterfaces.StaticMethodsInterfaces.PasswordStrengthValidator;

public interface SecurityUtils {

    static boolean isStrongPassword(String password) {

        if (password.length() < 8)
            return false;

        boolean hasUpper = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch))
                hasUpper = true;
            if (Character.isDigit(ch))
                hasDigit = true;
        }

        return hasUpper && hasDigit;
    }
}
