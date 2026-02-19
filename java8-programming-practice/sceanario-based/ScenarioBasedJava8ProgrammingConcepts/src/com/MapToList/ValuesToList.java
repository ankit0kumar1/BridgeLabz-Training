package com.MapToList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ValuesToList {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1,12);
		map.put(2,14);
		map.put(4, 17);
		map.put(3,20);
		List<Integer> list = map.values()
				.stream()
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
