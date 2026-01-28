package com.annotations.jsonfieldannotation;

public class Main {
    public static void main(String[] args) {

        User user = new User("Ankit", "ankit@gmail.com", 20, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}

