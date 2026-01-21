package com.movietime;

class Show {
    String movieName;
    int showTime; // time in minutes or HHMM format (e.g., 1430)

    Show(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return movieName + " at " + showTime;
    }
}
