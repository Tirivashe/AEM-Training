package com.shamhu.collectionpractice;
import java.util.*;

public class CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		
		numbers.add(3);
		numbers.add(4);
		numbers.add(8);
		numbers.add(2);
		numbers.add(9);
		
		Iterator itr = numbers.iterator();
		while (itr.hasNext()) {
		   System.out.println(itr.next());
		}
		
		System.out.println();
		
		Iterator itr2 = numbers.listIterator(3);
		while (itr2.hasNext()) {
		   System.out.println(itr2.next());
		}
		
		System.out.println();
		
		Iterator itr3 = numbers.descendingIterator();

	    System.out.println("Elements in Reverse Order:");
	    while (itr3.hasNext()) {
	       System.out.println(itr3.next());
	    }
	    
	    System.out.println();
	    
	    System.out.println("Original linked list: " + numbers);
		numbers.add(1, 7);

		System.out.println("The linked list with the added element in a specified position:" + numbers);
		
		numbers.addFirst(10);
		System.out.println("Element added on the first position: " + numbers);
		
		numbers.addLast(15);
		System.out.println("Element added on the last position: " + numbers);
		System.out.println();
		
		System.out.println("Original linked list:" + numbers);    
		numbers.offerFirst(12);
		System.out.println("Final linked list:" + numbers);
		System.out.println();
		
		System.out.println("Original linked list:" + numbers);    
		numbers.offerLast(13);
		System.out.println("Final linked list:" + numbers);
		System.out.println();
		
		
		LinkedList <Integer> numbers2 = new LinkedList<>();
		numbers2.add(23);
		numbers2.add(25);

		numbers.addAll(1, numbers2);

		System.out.println("New LinkedList with some added elements:" + numbers);
		System.out.println();
		
		System.out.println("Original linked list:" + numbers);  
		 
		Object first_element = numbers.getFirst();
		System.out.println("First Element is: "+first_element);
		 
		Object last_element = numbers.getLast();
		System.out.println("Last Element is: "+last_element);
		System.out.println();
		
		System.out.println("Original linked list:" + numbers);  
		for(int p = 0; p < numbers.size(); p++) System.out.println("Element at index " + p + ": " + numbers.get(p));
		System.out.println();
		
		System.out.println("The Original linked list: " + numbers);

		numbers.remove(2);
		System.out.println("The New linked list: " + numbers);
		System.out.println();
		
		System.out.println("The Original linked list: " + numbers);

		Object firstElement = numbers.removeFirst();
		System.out.println("First Element removed: "+ firstElement);
		 
		Object lastElement = numbers.removeLast();
		System.out.println("Last Element removed: "+ lastElement);
		System.out.println("The New linked list: " + numbers);
		System.out.println();
		
		System.out.println("The Original linked list: " + numbers);
		numbers.clear();
		System.out.println("The New linked list: " + numbers);
		System.out.println();
		
		LinkedList <String> colors = new LinkedList <String> ();
		colors.add("Red");
		colors.add("Green");
		colors.add("Black");
		colors.add("Pink");
		colors.add("orange");
		  
		System.out.println("The Original linked list: " + colors);
		  
		Collections.swap(colors, 0, 2);
	    System.out.println("The New linked list after swap: " + colors);
	    System.out.println();
	    
	    
	    System.out.println("Linked list before shuffling: " + colors);  
	    Collections.shuffle(colors);
	    System.out.println("Linked list after shuffling: " + colors);
	    System.out.println();
	    
	    LinkedList <String> colors2 = new LinkedList<>();
        colors2.add("White");
        colors2.add("Blue");
        colors2.add("Amber");
        colors2.add("Pink");
        System.out.println("List of second linked list: " + colors2);
        
        colors2.addAll(colors);
        System.out.println("New combined linkedlist: " + colors2);
        System.out.println();
        
        System.out.println("Original linkedlist: " + colors);
        System.out.println("Removed element: "+ colors.pop());
        System.out.println("Linked list after pop operation: "+ colors);
        System.out.println();
        
        System.out.println("Original linked list: " + colors); 
        String first = colors.peekFirst();
        System.out.println("First element in the list: " + first);
        System.out.println("Original unaltered linked list: " + colors);
        System.out.println();
        
        System.out.println("Original linked list: " + colors);    
        String last = colors.peekLast();
        System.out.println("Last element in the list: " + last);
        System.out.println("Original linked list: " + colors);
        System.out.println();
        
        if(colors.contains("Blue")) System.out.println("Blue is found");
        else System.out.println("Blue is not found");
        System.out.println();
        
        List<String> list = new ArrayList<String>(colors);
        for (String str : list){
          System.out.println(str);
        }
        System.out.println("New arraylist made: " + colors);
        System.out.println();
        
        LinkedList<String> comparisonList = new LinkedList<String>();
        for (String e : colors)
           comparisonList.add(colors2.contains(e) ? "Yes" : "No");
        System.out.println("Comparisons list generated: " + comparisonList);
        System.out.println();
        
        System.out.println("Original linked list: " + colors);
        System.out.println("Check the above linked list is empty or not! " + colors.isEmpty());
        System.out.println();
        
        System.out.println("Original linked list: " + colors);
        // Replacing 2nd element with new value
        colors.set(1, "Purple");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + colors);
        System.out.println();
	}
}
