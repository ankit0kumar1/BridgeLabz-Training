package com.movietime;

class MovieTime {

    public static void insertionSort(Show[] shows) {

        for (int i = 1; i < shows.length; i++) {
            Show currentShow = shows[i];
            int j = i - 1;

            // Shift shows that start later
            while (j >= 0 && shows[j].showTime > currentShow.showTime) {
                shows[j + 1] = shows[j];
                j--;
            }

            // Insert show at correct time position
            shows[j + 1] = currentShow;
        }
    }

    public static void main(String[] args) {

        Show[] schedule = {
            new Show("Movie A", 930),
            new Show("Movie B", 1100),
            new Show("Movie C", 1230),
            new Show("Movie D", 1000) // newly added show
        };

        insertionSort(schedule);

        System.out.println("Showtimes sorted by time:");
        for (Show s : schedule) {
            System.out.println(s);
        }
    }
}

