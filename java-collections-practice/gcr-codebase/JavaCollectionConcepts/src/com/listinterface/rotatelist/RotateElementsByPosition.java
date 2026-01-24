package com.listinterface.rotatelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateElementsByPosition {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		int k =2;
		
		k = k % list.size(); 
		
		List<Integer> rotated = new ArrayList<Integer>();
		rotated.addAll(list.subList(k, list.size()));
		rotated.addAll(list.subList(0, k));
		
		System.out.println(rotated);
		
	}
}
