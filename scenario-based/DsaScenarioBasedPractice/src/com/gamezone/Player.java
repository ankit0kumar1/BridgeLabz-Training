package com.gamezone;

class Player {
    String username;
    int score;

    Player(String username, int score) {
        this.username = username;
        this.score = score;
    }

    @Override
    public String toString() {
        return username + " -> " + score;
    }
}

