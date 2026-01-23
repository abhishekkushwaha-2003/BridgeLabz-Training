package com.Regex.ExtractionProblems;

import java.util.regex.*;

public class ExtractEmails {
    public static void main(String[] args) {

        String text = "Hello my E-mail id is abhishek@gmail.com and my friend's E-mail id is rajeev@gmail.com";

        // Regex for email pattern
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // find() is used to extract all matches
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

