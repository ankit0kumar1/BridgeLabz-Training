package com.generics.resumescreeningsystem;

abstract class JobRole {

    private String roleName;

    protected JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    // Each role defines its own screening logic
    public abstract void screen();
}

