package com.aurionpro.test;

import java.util.LinkedList;
import java.util.ListIterator;

public class CustomLinkedList {
	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<String>();
		System.out.println("Performing addition in linked list : ");
		names.add("Dhruv");
        names.addFirst("Pankaj");
        names.add("Kala");
        names.addLast("Kalavanti");
        names.add("Rajesh");
        names.add(2, "Jigna");
        System.out.println(names);
        
       

        System.out.println(names);
        
        System.out.println("Iterating :");
  
        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"\t");
        }
    
        System.out.println("\nUpdating linked list : ");
        names.set(4, "Nikul");
        System.out.println(names);
        
        System.out.println("Performing deletion in linked list : ");
        names.remove("Kala");
        names.remove(3);
        names.removeFirst();
        names.removeLast();
	}
}