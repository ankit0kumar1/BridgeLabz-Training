package com.gamebox;

public class GameBoxApp {
    public static void main(String[] args) {

        Game g1 = new ArcadeGame("Pixel Rush", 199, 4.5);
        Game g2 = new StrategyGame("Empire Mind", 299, 4.7);

        g1.playDemo();
        g2.playDemo();

        g2.applyDiscount(20); // seasonal offer

        User user = new User("Ankit");

        user.purchaseGame(g1);
        user.purchaseGame(g2);

        user.showOwnedGames();
    }
}
