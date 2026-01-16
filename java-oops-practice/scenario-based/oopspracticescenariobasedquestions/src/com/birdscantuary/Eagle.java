package com.birdscantuary;

class Eagle extends Bird implements Flyable {

    public Eagle(String id, String name) {
        super(id, name, "Eagle");
    }

    public void fly() {
        System.out.println(getName() + " flies high in the sky.");
    }

    public void displayInfo() {
        System.out.println(getId() + " | " + getName() + " | Eagle | Flyable");
    }
}

