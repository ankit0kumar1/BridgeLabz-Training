package com.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));
		Set<Integer> symetricdiff = new HashSet<Integer>();
		for(Integer i : set1) {
			if(!set2.contains(i)) {
				symetricdiff.add(i);
			}
		}
		for(Integer i : set2) {
			if(!set1.contains(i)) {
				symetricdiff.add(i);
			}
		}
		
		System.out.println(symetricdiff);
	}
}
