package com.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String prargraph = "Java is fun and Java is powerfull";
		
		Map<String , Integer> freqmap = Arrays.stream(prargraph.toLowerCase().split("\\s+"))
				.collect(Collectors.toMap(
						word -> word, 
						word ->1,
						Integer::sum
						));
		System.out.println(freqmap);
	}
}
