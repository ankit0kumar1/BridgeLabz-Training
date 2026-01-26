package com.queueinterface;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class ReverseQueue {
	
	public static void reverseQueue(Queue<Integer> queue) {
		if(queue.isEmpty()) return;
		int front = queue.poll();
		reverseQueue(queue);
		queue.add(front);
		
	}
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>(Arrays.asList(10,20,30));
		reverseQueue(queue);
		System.out.println(queue);
		
	}
}
