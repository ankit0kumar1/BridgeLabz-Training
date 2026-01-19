package com.fitnesstracker;

class User {
    String name;
    int steps;

    User(String name, int steps) {
        this.name = name;
        this.steps = steps;
    }

    @Override
    public String toString() {
        return name + " -> " + steps + " steps";
    }
}

