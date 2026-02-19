package com.MapToList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListOfCustomObjects {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "GenAI");
		List<KeyValue> list = map.entrySet()
				.stream()
				.map(e -> new KeyValue(e.getKey(), e.getValue()))
				.collect(Collectors.toList());
		list.forEach(System.out::println);
	}
}
class KeyValue{
	int key;
	String value;
	public KeyValue(int key, String value) {
		this.key = key;
		this.value = value;
	}
	@Override
	public String toString() {
		return "Key : " + key + " Value :" + value;
	}
}