package com.listinterface.frequencyofelements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FrequencyOfElements {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Arrays.asList("Apple", "Mango", "Banana", "Apple", "Orange", "Papaya" ));
		Map<String, Integer> frequency = new HashMap<String, Integer>();
		
		for(String item : list) {
			if(frequency.containsKey(item)) {
				frequency.put(item, frequency.get(item) +1);
			}else {
				frequency.put(item, 1);
			}
		}
		System.out.println(frequency);
		
	}
}
