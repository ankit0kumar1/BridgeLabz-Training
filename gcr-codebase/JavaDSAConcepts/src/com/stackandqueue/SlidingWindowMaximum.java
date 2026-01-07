package com.stackandqueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

	public static int[] maxSlidingWindow(int[] array, int k) {

		if (array.length == 0 || k <= 0) {
			return new int[0];
		}

		int n = array.length;
		int[] result = new int[n - k + 1];
		Deque<Integer> deque = new ArrayDeque<>();

		for (int i = 0; i < n; i++) {

			// Remove indices that are out of the current window
			if (!deque.isEmpty() && deque.peekFirst() == i - k) {
				deque.pollFirst();
			}

			// Remove smaller elements from the back
			while (!deque.isEmpty() && array[deque.peekLast()] <= array[i]) {
				deque.pollLast();
			}

			// Add current index
			deque.offerLast(i);

			// Store result once the first window is complete
			if (i >= k - 1) {
				result[i - k + 1] = array[deque.peekFirst()];
			}
		}

		return result;
	}

	public static void main(String[] args) {

		int[] array = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 3;

		int[] result = maxSlidingWindow(array, k);

		System.out.println("Array  : " + Arrays.toString(array));
		System.out.println("Result : " + Arrays.toString(result));
	}
}
