package com.Regex.ExtractionProblems;
import java.util.regex.*;

public class ExtractDates {
    public static void main(String[] args) {

        String text = "My Date Of Birth is 12/05/2003 and my friend's D.O.B. is 15/08/2004, and today's Date is 24/01/2026.";

        // dd/mm/yyyy date format
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

        Matcher matcher = Pattern.compile(regex).matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
