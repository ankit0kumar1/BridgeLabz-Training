package com.stringbuffer;

public class ConcatenateUsingStringBuffer {

    public static String concatenateStrings(String[] arr) {
        StringBuffer buffer = new StringBuffer();

        for (String s : arr) {
            buffer.append(s);
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Ankit", " ", "is", " ", "Good."};

        String result = concatenateStrings(words);
        System.out.println(result);
    }
}

