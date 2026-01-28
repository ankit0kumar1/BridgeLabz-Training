package com.annotations.jsonfieldannotation;

public class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_email")
    private String email;

    @JsonField(name = "user_age")
    private int age;

    private String password; // not annotated => not included in JSON

    public User(String username, String email, int age, String password) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.password = password;
    }
}
