package com.Regex.AdvanceProblems;

import java.util.regex.*;

public class RepeatingWords {
    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test.";

        // Captures repeated words using backreference
        String regex = "\\b(\\w+)\\s+\\1\\b";

        Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE)
                                 .matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
