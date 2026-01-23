package com.Regex.BasicRegexProblems;

import java.util.regex.*;

public class ValidateUsername {
    public static void main(String[] args) {

        // Regex for username validation
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        Pattern pattern = Pattern.compile(regex);

        String[] usernames = {"user_123", "123user", "us", "Valid_User", "user@123"};

        for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            System.out.println(username + " -> " + 
                (matcher.matches() ? "Valid" : "Invalid"));
        }
    }
}
