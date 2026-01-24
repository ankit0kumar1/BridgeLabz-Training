package com.setinterface;

import java.util.*;

public class SetToSortedList {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(3, 5, 9, 1));

		List<Integer> list = new LinkedList<Integer>();

		for (Integer s : set) {
			list.add(s);
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
