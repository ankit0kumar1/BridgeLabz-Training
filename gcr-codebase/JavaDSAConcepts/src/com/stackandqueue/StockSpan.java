package com.stackandqueue;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static int[] findStockSpan(int[] array) {

		int n = array.length;
		int[] span = new int[n];
		Stack<Integer> stack = new Stack<Integer>();

		if (n == 0) {
			System.out.println("Array is empty");
			return span;
		}

		span[0] = 1;
		stack.push(0);

		for (int i = 1; i < array.length; i++) {
			while (!stack.isEmpty() && array[stack.peek()] <= array[i]) {
				stack.pop();
			}
			span[i]=stack.isEmpty()?(i+1):(i-stack.peek());
			stack.push(i);
		}
		return span;
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 2, 9, 2, 6, 9, 0, 3, 5, 6, 74, 3, 12 };
		int[] result=findStockSpan(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(result));
		
	}
}
