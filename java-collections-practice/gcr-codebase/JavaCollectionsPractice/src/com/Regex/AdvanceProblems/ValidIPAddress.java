package com.Regex.AdvanceProblems;

public class ValidIPAddress {
    public static void main(String[] args) {

        String[] ips = {
            "192.168.1.1",
            "255.255.255.255",
            "256.1.1.1",
            "123.045.067.089"
        };

        // IPv4 range: 0–255
        String regex =
                "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}"
              + "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        for (String ip : ips) {
            System.out.println(ip + " → " + ip.matches(regex));
        }
    }
}
