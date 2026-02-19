package com.stream.listtomap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberSquare {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Map<Integer, Integer> map = list.stream()
				.collect(Collectors.toMap(e ->e, e -> e*e));
		System.out.println(map);
	}
}
