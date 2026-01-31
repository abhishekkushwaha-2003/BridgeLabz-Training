package com.JSON.IPLAndCensorAnalyzer;

public class IplCensorUtil {

    public static String maskTeam(String teamName) {
        if (teamName == null) return null;
        int index = teamName.indexOf(" ");
        return index != -1
                ? teamName.substring(0, index) + " ***"
                : "***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}
