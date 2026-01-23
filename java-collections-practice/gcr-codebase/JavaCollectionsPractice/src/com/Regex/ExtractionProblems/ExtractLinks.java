package com.Regex.ExtractionProblems;

import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://youtube.com for more info.";

        // http or https URLs
        String regex = "https?://[^\\s]+";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
