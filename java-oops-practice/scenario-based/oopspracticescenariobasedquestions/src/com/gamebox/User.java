package com.gamebox;

import java.util.*;

class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    // Controlled access
    public void purchaseGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.title);
    }

    public void showOwnedGames() {
        System.out.println(username + "'s Library:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title + " (" + g.genre + ")");
        }
    }
}

