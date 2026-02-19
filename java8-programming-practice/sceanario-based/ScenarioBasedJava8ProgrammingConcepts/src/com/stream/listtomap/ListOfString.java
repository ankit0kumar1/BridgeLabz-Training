package com.stream.listtomap;

import java.util.*;
import java.util.stream.*;


public class ListOfString {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Ankit", "Keshav", "Sanchit","Bob"));
		Map<String, Integer> map = new HashMap<>();
		map = list.stream()
				.collect(Collectors.toMap(e->e,e-> e.length()));
		System.out.println(map);
	}
}
