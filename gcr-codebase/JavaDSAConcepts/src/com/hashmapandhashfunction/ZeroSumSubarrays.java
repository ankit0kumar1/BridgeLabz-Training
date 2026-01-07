package com.hashmapandhashfunction;

import java.util.*;

public class ZeroSumSubarrays {

	public static void findZeroSumSubarrays(int[] arr) {
		// Map: prefixSum -> list of indices where it occurs
		Map<Integer, List<Integer>> map = new HashMap<>();

		int sum = 0;

		// handle subarrays starting at index 0
		map.put(0, new ArrayList<>(List.of(-1)));

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (map.containsKey(sum)) {
				for (int startIndex : map.get(sum)) {
					System.out.println("Zero-sum subarray: [" + (startIndex + 1) + " .. " + i + "]");
				}
			}

			map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, -7, 1, 3, 3, 1, -4 };
		findZeroSumSubarrays(arr);
	}
}
