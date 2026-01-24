package com.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionOfTwoSets {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));
		Set<Integer> union = new HashSet<Integer>();
		for(Integer s : set1) {
			union.add(s);
		}
		for(Integer s : set2) {
			union.add(s);
		}
		System.out.println(union);
		
		Set<Integer> intersection = new HashSet<Integer>();
		for(Integer s : set1) {
			if(set2.contains(s)) {
				intersection.add(s);
			}
		}
		System.out.println(intersection);
	}
}
