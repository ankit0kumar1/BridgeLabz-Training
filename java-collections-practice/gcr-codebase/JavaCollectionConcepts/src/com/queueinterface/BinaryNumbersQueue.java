package com.queueinterface;

import java.util.*;

public class BinaryNumbersQueue {

    public static List<String> generateBinary(int n) {
        List<String> result = new ArrayList<>();
        if (n <= 0) return result;

        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String s = q.remove();   // front element
            result.add(s);

            q.add(s + "0");
            q.add(s + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generateBinary(n));
    }
}

