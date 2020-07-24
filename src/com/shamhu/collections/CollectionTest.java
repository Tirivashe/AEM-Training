package com.shamhu.collections;
import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		List person = new ArrayList();
		
		person.add("Ben");
		person.add(35);
		person.add("Male");
		person.add("375-987-4321");
		person.add("100 Cleveland Street, Cleveland, OH");
		
		Iterator itr = person.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("");
		
		
		Map person2 = new HashMap();
		
		person2.put("Name", "Ben");
		person2.put("Age", 35);
		person2.put("Gender", "Male");
		person2.put("Contact", "375-987-4321");
		person2.put("Address", "100 Cleveland Street, Cleveland, OH");
		
		for(Object keyValue: person2.keySet()){
			System.out.print(keyValue);
			System.out.println(": " + person2.get(keyValue));
		}
		
	}

}
