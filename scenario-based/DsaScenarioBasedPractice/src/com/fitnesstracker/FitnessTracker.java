package com.fitnesstracker;

class FitnessTracker {

    public static void bubbleSort(User[] users) {
        int n = users.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                // Sort in descending order (highest steps first)
                if (users[j].steps < users[j + 1].steps) {
                    User temp = users[j];
                    users[j] = users[j + 1];
                    users[j + 1] = temp;
                    swapped = true;
                }
            }

            // Stop early if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        User[] dailyUsers = {
            new User("Aditi", 8200),
            new User("Rohan", 10500),
            new User("Meera", 9600),
            new User("Kabir", 7200),
            new User("Sana", 11000)
        };

        bubbleSort(dailyUsers);

        System.out.println("Daily Step Leaderboard:");
        for (User u : dailyUsers) {
            System.out.println(u);
        }
    }
}

