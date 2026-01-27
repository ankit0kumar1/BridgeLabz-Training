package com.regex;

public class IPValidator {
    public static void main(String[] args) {
        String[] ips = {
            "192.168.1.1",
            "255.255.255.255",
            "0.0.0.0",
            "256.10.1.2",
            "192.168.1",
            "192.168.01.1"
        };

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)$";

        for (String ip : ips) {
            System.out.println(ip + " -> " + (ip.matches(regex) ? "Valid" : "Invalid"));
        }
    }
}

