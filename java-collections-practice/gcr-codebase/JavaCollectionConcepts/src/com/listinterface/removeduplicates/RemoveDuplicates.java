package com.listinterface.removeduplicates;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>(Arrays.asList(3, 1, 2, 2, 3, 4));
		List<Integer> result = new LinkedList<>();
		for(int data : list) {
			if(!result.contains(data)) {
				result.add(data);
			}
		}
		System.out.println(result);
	}
}
