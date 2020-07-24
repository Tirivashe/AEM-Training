package com.shamhu.collections;
import java.util.*;

public class CollectionLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
 
        list.add("JAVA");
 
        list.add("J2EE");
 
        list.add("JSP");
 
        list.add("SERVLETS");
 
        list.add("JDBC");
        System.out.println(list);
        
        list.offerFirst("JS");
        
        list.addFirst("CSS");
 
        Iterator<String> it = list.iterator();

 
 
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        arrayList.add("SIX");
 
        arrayList.add("SEVEN");
 
        arrayList.add("EIGHT");
 
        arrayList.add("NINE");
 
 
        System.out.println(arrayList);
 
        list.addAll(arrayList);
 
        System.out.println(list);

	}

}
