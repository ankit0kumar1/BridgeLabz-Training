package com.cinemahouse;
class CinemaHouse {

    public static void bubbleSort(int[] showTimes) {
        int n = showTimes.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                    swapped = true;
                }
            }

           
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] showTimes = {900, 1100, 1030, 1300, 1000};

        bubbleSort(showTimes);

        for (int time : showTimes) {
            System.out.print(time + " ");
        }
    }
}

