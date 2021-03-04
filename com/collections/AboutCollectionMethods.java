/* 
 * Collection is a interface present in java.util.package.
 *  It is used to represent a group of individual objects as a single unit. 
 *   The collection is considered as the root interface of the collection framework. 
 *   It provides several classes and interfaces to represent a group of individual objects as a single unit. 
 *	
 *The List, Set, and Queue are the main sub-interfaces of the collection interface. 
 *The map interface is also part of the java collection framework,
 * but it doesn’t inherit the collection of the interface
 * 
 * collections:
 * It is a utility class.
 * It defines several utility methods that are used to operate on collection.
 * It contains only static methods.
 * 
 * 
 */




package com.collections;
import java.util.Collection;
import java.util.ArrayList;
public class AboutCollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an Empty ArrayList
		Collection<Integer> c=new ArrayList<Integer>();
		
		//1. add():
//		Inserting values to ArrayList using add method
//		Returns true if object was added to the collection. 
//		Returns false if object is already a member of the collection, 
//		or if the collection does not allow duplicates.
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		
		//creating an Empty ArrayList
		Collection<Integer> c1=new ArrayList<Integer>();
				
		//Inserting values to ArrayList using add method
		System.out.println("Add:"+c1.add(11));
		c1.add(1);
		c1.add(6);
		c1.add(4);
		c1.add(5);
		
//		2.addAll() :
//		adding all elements of c1 to c ..Returns true if 
//		 the elements were added. Otherwise, returns false.
		System.out.println("addAll:"+c.addAll(c1));
		
//		3.size():
//		returns the no:of elements in the collection
		System.out.println("size of c1:"+c.size());
		
//		4.contains()
//		returns true if the element is present in that collection otherwise returns false
		System.out.println("contains:"+c.contains(1)); 
		
		
//		5.containsAll
//		returns true if collection c contains all elements of c1 otherwise returns false
		System.out.println("containsAll:"+c.containsAll(c1));
		
		
//		6.remove:removes the element passed
//			Returns true if the element was removed. Otherwise, returns false.
		System.out.println("remove:"+c1.remove(6));
	
	
//		7.removeAll:remove all elements of that collection
//		Returns true if the element were removed. Otherwise, returns false.
		System.out.println("removeAll elements of c1 from c:"+c.removeAll(c1));
	
	}

}
