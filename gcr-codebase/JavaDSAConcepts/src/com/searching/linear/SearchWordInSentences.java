package com.searching.linear;

public class SearchWordInSentences {

    public static String findSentenceContainingWord(String[] sentences, String word) {

        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // first matching sentence
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is a programming language",
            "Learning data structures is important",
            "Linear search is simple",
            "Practice makes progress"
        };

        String word = "search";

        String result = findSentenceContainingWord(sentences, word);
        System.out.println(result);
    }
}

