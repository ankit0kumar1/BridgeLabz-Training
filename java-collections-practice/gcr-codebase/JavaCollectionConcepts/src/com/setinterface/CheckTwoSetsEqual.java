package com.setinterface;

import java.util.*;

public class CheckTwoSetsEqual {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
		Set<Integer>set2 = new HashSet<Integer>(Arrays.asList(3,2,1));
		System.out.println(set1);
		System.out.println(set2);
		
		System.out.println(set1.equals(set2));
	}
}
