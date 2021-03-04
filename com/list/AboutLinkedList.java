/*
 * java LinkedList class can contain duplicate elements.
Java LinkedList class maintains insertion order.
Java LinkedList class is non synchronized.
In Java LinkedList class, manipulation is fast because no shifting needs to occur.*/

package com.list;

import java.util.LinkedList;
public class AboutLinkedList {
	public static void main(String[] args) {
		
		// Creating empty LinkedList
		LinkedList<Object> list=new LinkedList<Object>();
		
		//adding values to the LinkedList 
		list.add(new Student(571,"varshi","varshithapunati@gmail.com"));
		list.add(new Student(572,"yashu","yashupunati@gmail.com"));
		list.add(new Student(573,"lakshmi","lakshmipunati@gmail.com"));
		list.add(new Student(575,"sailu","sailupunati@gmail.com"));
		
		//printing size of the LinkedList
		System.out.println("size of the list using size method:"+list.size());
		
		// Creating another empty LinkedList
		LinkedList<Object> list1=new LinkedList<Object>();
		
		//adding values to the LinkedList 
		list1.add(new Student(576,"dharani","dharanipunati@gmail.com"));
		list1.add(new Student(577,"neeru","neerupunati@gmail.com"));
		list1.add(new Student(578,"sravya","sravyapunati@gmail.com"));
		list1.add(new Student(579,"kavya","kavyapunati@gmail.com"));
		
		//printing size of the LinkedList
		System.out.println("size of the list1 using size method:"+list1.size());
		
		//Adding list1 to list
		list.addAll(list1);
		
		//adding in first index
		list.addFirst(new Student(570,"varshi","punati@gmail.com"));
		
		//adding in last index
		list.addLast(new Student(580,"harish","chunduri@gmail.com"));
		
		//now again printing size of the arrayList list
		System.out.println("after adding list1 to list the size of list is:"+list.size());
		
		System.out.println();
		for(Object s:list) {
			System.out.println(s);
		}
		//Creating an empty linkedList
		  LinkedList<String> llist = new LinkedList<String>();

		  llist.add("Hi");
		  llist.add("I");
		  llist.add("java");
		  System.out.println("Linked List :" + llist);

		  // get the index for "I"
//			This method returns the index of the element given in the linked list starting from first position. 
//			Otherwise it will return -1,if that element is not present in the linked list
		  System.out.println("Index for Chocolate:" + llist.indexOf("I"));

		  // get the index for "Android"

		  System.out.println("Index for Coffee:" + llist.indexOf("Android"));
		  
//		  This method retrieves and removes the First element from this linked list.
		  System.out.println("Last element:" + llist.removeFirst());
//		  This method retrieves and removes the last element from this linked list.
		  System.out.println("Last element:" + llist.removeLast());
		
		  System.out.println(llist);
		  System.out.println("Object to be replaced:" + llist.set(0, "Android"));
		  System.out.println(llist);
		  
		//by using get method 
		System.out.println("by using get method:"+list.get(5));
		//by using get method displaying first value
		System.out.println("by using getfirst method:"+list.getFirst());
		//by using get method displaying last value
		System.out.println("by using getlast method:"+list.getLast());
		
		// Printing the top element using poll method without removing it
		System.out.println("pollmethod:"+list.poll());
				
		// Printing the first element
		System.out.println("pollFirst method:"+list.pollFirst());
				
		// Printing the last element
		System.out.println("polLast method:"+list.pollLast());
				
		//removing last Element
		System.out.println("removeFirst method:"+list.removeFirst());
		
		// Printing the top element and removing it by using poll method
		System.out.println("Printing the top element and removing it by using poll method:"+list.peek());

		// Printing the first element and removing it by using poll method
		System.out.println("Printing the first element and removing it by using poll method:"+list.peekFirst());

		// Printing the last element and removing it by using poll method
		System.out.println("Printing the last element and removing it by using poll method:"+list.peekLast());
		
		Object l1=list1.clone();
		System.out.println("after cloning :"+l1);
		System.out.println("before clearing the size of the list is:"+list.size());
		list.clear();
		System.out.println("after clearing the size of the list is:"+list.size());
	}
	
}
