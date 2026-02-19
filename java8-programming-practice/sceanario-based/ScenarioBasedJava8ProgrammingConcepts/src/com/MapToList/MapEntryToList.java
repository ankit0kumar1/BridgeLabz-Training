package com.MapToList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapEntryToList {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "GenAI");
		List<Map.Entry<Integer, String>> entryList = map.entrySet()
				.stream()
				.collect(Collectors.toList());
		System.out.println(entryList);
	}
}
