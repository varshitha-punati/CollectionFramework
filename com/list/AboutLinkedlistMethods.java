package com.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AboutLinkedlistMethods {
	public static void main(String[] args) {
		
		//creating an empty linked list
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		//adding values to linkedlist
		l1.add(17);
		l1.add(12);
		l1.add(21);
		
		System.out.print("Before sorting:");
		System.out.println(l1);
		Collections.sort(l1);
		System.out.print("After sorting:");
		System.out.println(l1);
		

		Object[] array=l1.toArray();
		System.out.println("After converting linked list into array ");
		System.out.println(Arrays.toString(array));
		
		l1.stream().forEach(t->System.out.println(t));
		
		// getting the subList 
        // using subList() method 
        System.out.println("sublist"); 
        List<Integer> list = l1.subList(1, 2); 
        System.out.println(list);
	}
}
