package com.cinemahouse;

class CinemaHouse {

	public static void bubbleSort(Show[] shows) {
		int n = shows.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - i - 1; j++) {
				if (shows[j].time > shows[j + 1].time) {
					Show temp = shows[j];
					shows[j] = shows[j + 1];
					shows[j + 1] = temp;
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

		Show[] dailyShows = { new Show("Movie A", 1100), new Show("Movie B", 930), new Show("Movie C", 1300),
				new Show("Movie D", 1000), new Show("Movie E", 1200) };

		bubbleSort(dailyShows);

		System.out.println("Showtimes sorted by time:");
		for (Show s : dailyShows) {
			System.out.println(s.movieName + " -> " + s.time);
		}
	}
}
