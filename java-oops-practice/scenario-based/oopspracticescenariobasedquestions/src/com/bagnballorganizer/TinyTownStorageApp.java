package com.bagnballorganizer;

import java.util.ArrayList;
import java.util.List;

class TinyTownStorageApp {

    public static void main(String[] args) {

        Bag redBag = new Bag("B1", "Red", 2);
        Bag blueBag = new Bag("B2", "Blue", 3);

        Ball ball1 = new Ball("BL1", "Yellow", "Small");
        Ball ball2 = new Ball("BL2", "Green", "Medium");
        Ball ball3 = new Ball("BL3", "Blue", "Large");

        redBag.addBall(ball1);
        redBag.addBall(ball2);
        redBag.addBall(ball3); // should fail (capacity reached)

        redBag.displayBalls();

        redBag.removeBall("BL1");
        redBag.displayBalls();

        blueBag.addBall(ball3);

        // Display all bags and ball counts
        List<Bag> bags = new ArrayList<>();
        bags.add(redBag);
        bags.add(blueBag);

        System.out.println("\nBag Summary:");
        for (Bag bag : bags) {
            System.out.println(
                "Bag " + bag.getId() +
                " (" + bag.getColor() + ") has " +
                bag.getBallCount() + " balls."
            );
        }
    }
}

