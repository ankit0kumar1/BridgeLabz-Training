package com.gamezone;

class GamerZone {

    public static void quickSort(Player[] players, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(players, low, high);

            quickSort(players, low, pivotIndex - 1);
            quickSort(players, pivotIndex + 1, high);
        }
    }

    private static int partition(Player[] players, int low, int high) {
        int pivot = players[high].score; // pivot by score
        int i = low - 1;

        for (int j = low; j < high; j++) {
            // Descending order (higher score first)
            if (players[j].score >= pivot) {
                i++;
                Player temp = players[i];
                players[i] = players[j];
                players[j] = temp;
            }
        }

        Player temp = players[i + 1];
        players[i + 1] = players[high];
        players[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        Player[] leaderboard = {
            new Player("Ankit", 1450),
            new Player("Sanchit", 1720),
            new Player("Ramvishal", 1600),
            new Player("Tanisha", 1800),
            new Player("Khushi", 1500)
        };

        quickSort(leaderboard, 0, leaderboard.length - 1);

        System.out.println("GamerZone Leaderboard:");
        for (Player p : leaderboard) {
            System.out.println(p);
        }
    }
}

