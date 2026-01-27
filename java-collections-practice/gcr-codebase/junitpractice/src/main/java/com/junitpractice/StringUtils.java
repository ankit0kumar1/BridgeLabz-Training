package com.junitpractice;

public class StringUtils {

    public String reverse(String str) {
        if (str == null) return null;

        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public boolean isPalindrome(String str) {
        if (str == null) return false;

        String reversed = reverse(str);
        return str.equals(reversed);
    }

    public String toUpperCase(String str) {
        if (str == null) return null;

        return str.toUpperCase();
    }
}

