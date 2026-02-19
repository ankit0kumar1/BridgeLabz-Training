package com.stream.listtomap;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexAsKey {
	public static void main(String[] args) {
		List<String> list = List.of("ankit","aryan","rohan");
		Map<Integer, String> map = IntStream.range(0, list.size())
				.boxed()
				.collect(Collectors.toMap(i -> i,list::get));
		System.out.println(map);
	}
}
