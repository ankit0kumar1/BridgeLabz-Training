package com.stream.listtomap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapGroupedByLength {
	public static void main(String[] args) {
		List<String> list = List.of("cat", "elephant","lion","dog","bird");
		Map<Integer, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}
}
