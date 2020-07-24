package com.shamhu.collections;
import java.util.*;

public class CollectionExp {

	public static void main(String[] args) {
		Map person = new HashMap();
		
		List<String> addresses = new ArrayList<>();
		
		addresses.add("100 Cleveland Street, Cleveland, OH");
		
		person.put("Name", "Ben");
		person.put("Age", 45);
		person.put("Address", addresses);
		
		System.out.println(person.get("Address"));

	}

}
