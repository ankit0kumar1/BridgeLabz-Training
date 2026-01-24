package com.listinterface.findnthformend;

import java.util.*;

public class FindNthFromEnd {
	public static <T> T findNthFromEnd(List<T> list, int k) {
		if(list.isEmpty() || list == null || k<= 0) {
			System.out.println("null");
			return null;
		}
		Iterator<T> fast = list.iterator();
		Iterator<T> slow = list.iterator();
		
		for(int i =0 ; i< k ; i++) {
			if(fast.hasNext()) fast.next();
			else return null;
		}
		
		while(fast.hasNext()) {
			fast.next();
			slow.next();
		}
		return slow.next();
	}
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6));
		
		System.out.println(findNthFromEnd(list, 2));
		
	}
}
