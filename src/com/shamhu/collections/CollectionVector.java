package com.shamhu.collections;
import java.util.*;

public class CollectionVector {
	public static void main(String[] args) {
		Vector<String> mammals= new Vector<>();

        
        mammals.add("Dog");
        mammals.add("Horse");

        
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
        
        String element = animals.get(2);
        System.out.println("Element at index 2: " + element);

        // Using iterator()
        Iterator<String> iterate = animals.iterator();
        System.out.print("Vector: ");
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        
        String element2 = animals.remove(1);
        System.out.println("Removed Element: " + element2);
        System.out.println("New Vector: " + animals);

        
        animals.clear();
        System.out.println("Vector after clear(): " + animals);
	}
}
