package com.functionalinterface.dataserialization;

import java.io.Serializable;

class UserProfile implements BackupSerializable, Serializable {
    private String username;
    private int age;

    public UserProfile(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserProfile{username='" + username + "', age=" + age + "}";
    }
}
