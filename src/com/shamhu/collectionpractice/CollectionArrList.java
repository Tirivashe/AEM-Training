package com.shamhu.collectionpractice;
import java.util.*;

public class CollectionArrList {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("Blue");
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		colors.add("Orange");
		colors.add("Maroon");
		colors.add("Grey");
		
		System.out.println(colors);
		
		Iterator<String> itr = colors.iterator();
		while(itr.hasNext()) System.out.println(itr.next());
		System.out.println();
		
		colors.add(0, "Gold");
		System.out.println(colors);
		System.out.println();
		
		System.out.println("Retrieving item at index 2: " + colors.get(2));
		System.out.println();
		
		colors.set(2, "Black");
		System.out.println(colors);
		System.out.println();
		
		System.out.println("Element removed: " + colors.remove(3));
		System.out.println(colors);
		System.out.println();
		
		System.out.println(colors.indexOf("Blue"));
		System.out.println();
		
		Collections.sort(colors);
		System.out.println(colors);
		System.out.println();
		
		//copied colors arrayList into colorsArrList
		ArrayList<String> colorsArrList = new ArrayList<>(colors);
		System.out.println(colorsArrList);
		System.out.println();
		
		//shuffling an arraylist
		Collections.shuffle(colorsArrList);
		System.out.println(colorsArrList);
		System.out.println();
		
		//reverse the elements in an array list
		Collections.reverse(colors);
		System.out.println(colors);
		System.out.println();
		
		//extract portion of an arraylist
		System.out.println(colorsArrList.subList(0, 3));
		System.out.println();
		
		//swap 2 elements in an arraylist
		System.out.println("List before swap: " + colors);
		Collections.swap(colors, 0, 2);
		System.out.println("List after swap: " + colors);
		System.out.println();
		
		//joining 2 arraylist
		colorsArrList.addAll(colors);
		System.out.println(colorsArrList);
		System.out.println();
		
		//emptying an arraylist
		colorsArrList.removeAll(colorsArrList);
		System.out.println(colorsArrList);
		System.out.println();
		
		//test to see if an arraylist is empty
		System.out.println("Is the arraylist empty: " + colorsArrList.isEmpty());
		System.out.println();
		
		//trim the size of an arraylist
		colors.trimToSize();
		System.out.println(colors);
		
		//increase size of an arraylist
		System.out.println("Current arraylist size: " + colors.size());
		colors.ensureCapacity(10);
		System.out.println();
		
		//replace an element in an arraylist
		System.out.println("ArrayList before replacement: " + colors);
		colors.set(1, "White");
		System.out.println("ArrayList after replacement: " + colors);
		System.out.println();
		
		//print arraylist elements based on index position
		for(int i = 0; i < colors.size(); i++){
			System.out.println(colors.get(i));
		}
	}

}
