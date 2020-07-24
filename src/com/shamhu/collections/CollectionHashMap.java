package com.shamhu.collections;
import java.util.*;

public class CollectionHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(5, "five");
		map.put(6, "six");
		map.put(2, "two");
		map.put(1, "one");
		map.put(9, "nine");
		System.out.println(map);
		
		map.put(7, "seven");
		System.out.println(map);
		
		System.out.println(map.get(5));
		
		for (Map.Entry<Integer,String> entry:map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":"+ value);
		}
	}

}
