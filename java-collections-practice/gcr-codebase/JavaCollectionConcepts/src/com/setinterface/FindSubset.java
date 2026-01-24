package com.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindSubset {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2,3));
		Set<Integer>set2 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4));
		boolean isSubset = true;
		for(Integer i : set1) {
			if(!set2.contains(i)) {
				isSubset = false;
				break;
			}
		}
		System.out.println(isSubset);
	}
}
