package com.streamapi.top5trendingmovie;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Marty Supreme", 8.2, 2025));
		list.add(new Movie("Avenger", 9.2, 2023));
		list.add(new Movie("The BatMan", 7.0, 2022));
		list.add(new Movie("Logan", 8.1, 2017));
		list.add(new Movie("Arrival", 7.9, 2016));
		list.add(new Movie("Soul", 8.1, 2020));
		list.add(new Movie("Infinity War", 8.4, 2018));
		list.add(new Movie("12th Fail", 8.7, 2023));
		list.add(new Movie("Oppenheimer", 8.2, 2023));

		List<Movie> top5 = list.stream().filter(m -> m.getReleaseYear() >= 2018)
				.sorted(Comparator.comparing(Movie::getRating).reversed()
						.thenComparing(Comparator.comparing(Movie::getReleaseYear).reversed()))

				.limit(5).collect(Collectors.toList());
		System.out.println(top5);

	}
}
