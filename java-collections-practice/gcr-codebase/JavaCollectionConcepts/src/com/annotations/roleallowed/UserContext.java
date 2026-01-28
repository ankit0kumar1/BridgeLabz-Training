package com.annotations.roleallowed;

public class UserContext {

    private static String currentRole = "USER"; // default role

    public static void setRole(String role) {
        currentRole = role;
    }

    public static String getRole() {
        return currentRole;
    }
}

