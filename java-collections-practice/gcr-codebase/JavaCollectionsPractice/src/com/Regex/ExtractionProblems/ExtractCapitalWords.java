package com.Regex.ExtractionProblems;

import java.util.regex.*;

public class ExtractCapitalWords {
    public static void main(String[] args) {

        String text = "Hello everone I am learning Regex in Java";

        // Word starting with capital letter
        String regex = "\\b[A-Z][a-z]*\\b";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
