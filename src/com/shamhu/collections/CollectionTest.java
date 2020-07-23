package com.shamhu.collections;
import java.util.*;

public class CollectionTest {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Alex");
		names.add("Ben");
		names.add("Casey");
		names.add("Derek");
		names.add("Elton");
		names.add("Fiona");
		
		names.forEach(name -> System.out.println(name));
	}

}
