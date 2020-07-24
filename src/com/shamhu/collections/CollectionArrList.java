package com.shamhu.collections;
import java.util.*;

public class CollectionArrList {

	public static void main(String[] args) {
		ArrayList<String> animals = new ArrayList<>();
	    animals.add("Giraffe");
	    animals.add("Cow");
	    animals.add("Cat");
	    animals.add("Lion");
	    System.out.println("All animals: " + animals);
	    
	    System.out.println("Animal at index 0: " + animals.get(0));
	    
	    animals.set(0, "Hedgehog");
	    System.out.println(animals);
	    
	    animals.remove(0);
	    System.out.println(animals);
	    
	    System.out.println("ArrayList size: " + animals.size());
	    
	    for (int i = 0; i < animals.size(); i++) {
	        System.out.println(animals.get(i));
	      }
	    
	    Collections.sort(animals);  
	    for (String i : animals) {
	      System.out.println(i);
	    }

	}

}
