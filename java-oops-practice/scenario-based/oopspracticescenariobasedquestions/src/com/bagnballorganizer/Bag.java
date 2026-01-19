package com.bagnballorganizer;

import java.util.ArrayList;
import java.util.List;

class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private List<Ball> balls;

    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    // Add ball (with capacity check)
    public void addBall(Ball ball) {
        if (balls.size() >= capacity) {
            System.out.println("Bag " + id + " is full. Cannot add ball.");
            return;
        }
        balls.add(ball);
        System.out.println("Ball added to Bag " + id);
    }

    // Remove ball by ID
    public void removeBall(String ballId) {
        for (Ball b : balls) {
            if (b.getId().equals(ballId)) {
                balls.remove(b);
                System.out.println("Ball removed from Bag " + id);
                return;
            }
        }
        System.out.println("Ball not found in Bag " + id);
    }

    // Display balls in this bag
    public void displayBalls() {
        System.out.println("Balls in Bag " + id + ":");
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
            return;
        }
        for (Ball b : balls) {
            System.out.println(b);
        }
    }

    public int getBallCount() {
        return balls.size();
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getColor() {
        return color;
    }
}

