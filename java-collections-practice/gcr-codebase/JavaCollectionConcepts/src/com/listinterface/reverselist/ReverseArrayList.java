package com.listinterface.reverselist;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		int i = 0 , j = list.size() -1;
		while(i< j) {
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
		System.out.println(list);
	}
}
