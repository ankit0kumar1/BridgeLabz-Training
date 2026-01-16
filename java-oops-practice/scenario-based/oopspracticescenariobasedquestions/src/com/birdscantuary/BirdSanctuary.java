package com.birdscantuary;

import java.util.ArrayList;
import java.util.Iterator;

class BirdSanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void displayAllBirds() {
        for (Bird b : birds) {
            b.displayInfo();
        }
    }

    public void displayFlyingBirds() {
        for (Bird b : birds) {
            if (b instanceof Flyable) {
                ((Flyable) b).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for (Bird b : birds) {
            if (b instanceof Swimmable) {
                ((Swimmable) b).swim();
            }
        }
    }

    public void displayBothFlyAndSwim() {
        for (Bird b : birds) {
            if (b instanceof Flyable && b instanceof Swimmable) {
                b.displayInfo();
            }
        }
    }

    public void removeBirdById(String id) {
        Iterator<Bird> it = birds.iterator();
        while (it.hasNext()) {
            if (it.next().getId().equals(id)) {
                it.remove();
                System.out.println("Bird removed successfully.");
                return;
            }
        }
        System.out.println("Bird ID not found.");
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird b : birds) {
            boolean f = b instanceof Flyable;
            boolean s = b instanceof Swimmable;

            if (f && s) both++;
            else if (f) fly++;
            else if (s) swim++;
            else neither++;
        }

        System.out.println("Flyable: " + fly);
        System.out.println("Swimmable: " + swim);
        System.out.println("Both: " + both);
        System.out.println("Neither: " + neither);
    }
}
