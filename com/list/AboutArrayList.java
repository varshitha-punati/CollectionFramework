/*
 * List interface is the child interface of Collection interface.
It inhibits a list type data structure in which we can store the ordered collection of objects. 
It can have duplicate values.
List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack
	
ArrayList:

 The ArrayList class implements the List interface.
 It uses a dynamic array to store the duplicate element of different data types. 
 The ArrayList class maintains the insertion order and is non-synchronized.
 The elements stored in the ArrayList class can be randomly accessed. 
*/



package com.list;
import java.util.*; 
	import java.util.ArrayList;
	
public class AboutArrayList {
	public static void main(String[] args) {
		
		  // Creating empty ArrayList
		List<Object> list=new ArrayList<Object>();
		
		System.out.println(list.size());
		
		//adding values to the ArrayList 
//		The add method is used to add elements in that list
		list.add(new Student(571,"varshi","varshithapunati@gmail.com"));
		list.add(new Student(572,"yashu","yashupunati@gmail.com"));
		list.add(new Student(573,"lakshmi","lakshmipunati@gmail.com"));
		list.add(new Student(575,"sailu","sailupunati@gmail.com"));
		
		//now adding the new object to list at index 4
		list.add(3,new Student(574,"ishu","ishupunati@gmail.com"));
		
		//printing size of the arrayList
		System.out.println("size of the list using size method:"+list.size());
		
	
		 // Creating another empty ArrayList
		ArrayList<Object> list1=new ArrayList<Object>(20);
		System.out.println("lis1 intial size"+list1.size());
		
		//adding values to the ArrayList 
		list1.add(new Student(576,"dharani","dharanipunati@gmail.com"));
		list1.add(new Student(577,"neeru","neerupunati@gmail.com"));
		list1.add(new Student(579,"kavya","kavyapunati@gmail.com"));
		list1.add(new Student(578,"sravya","sravyapunati@gmail.com"));
			
		//printing size of the arrayList
//		The size() method is used to get the number of elements in this list.
		System.out.println("size of the list1 using size method:"+list1.size());
		
		
		//Trims the capacity  of ArrayList to current size of the list 
//		The following example creates an ArrayList with a capacity of 20 elements. 
//		Four elements are then added to the ArrayList and the ArrayList is trimmed accordingly.
		list1.trimToSize();
		System.out.println("trim to size list1:"+list1.size());
		list1.add(new Student(578,"sravya","sravyapunati@gmail.com"));
		System.out.println("trim to size list1:"+list1.size());	
		//Increase capacity to 10
/*	
 * Consider a scenario when there is a need to add huge number of elements to an already full ArrayList,
		in such case ArrayList has to be resized several number of times which would result in a poor performance.
		For such scenarios ensureCapacity() method of Java.util.ArrayList class is very useful as
		it increases the size of the ArrayList by a specified capacity.
		*/
	      list1.ensureCapacity(40);
	      
	      
	      
	    //Adding  all list1 collection elements to to list 
			list.addAll(list1);
	      System.out.println(list.size());
	      
	   // Create an empty ArrayList.
	        ArrayList<String> myArrayList = new ArrayList<String>();
			
		 // Test whether the array is empty or not.
//	        The isEmpty() method is used to check if the list is empty or not.
	      if (myArrayList.isEmpty())
	        {
	            System.out.println("The ArrayList is empty");
	        }
	        else
	        {
	            System.out.println("The ArrayList is not empty");
	        }
	      
	      myArrayList.add("tom");
	      myArrayList.add("tom");
	      myArrayList.add("cat");
	      
	     
	      System.out.print("Is   myArrayList contains the student tom?");
	      
	      

	       System.out.println( myArrayList.contains("tom"));
	       
//		      The contains() method is used to determines whether an element exists in an ArrayList object.
//		      Returns true if this list contains the specified element.
	       System.out.println( myArrayList.indexOf("tom"));
	       
//	       The lastIndexOf() method is used to get the index of the last occurrence of an element in an ArrayList object.
	       System.out.println( myArrayList.lastIndexOf("tom"));
	       
	       
	       
		
		
		//now again printing size of the arrayList list
		System.out.println("after adding list1 to list the size of list is:"+list.size());
		
		
//		The Java.util.ArrayList.clone() method is used to create a shallow copy of the mentioned array list.
//		It just creates a copy of the list.
		Object listobj=list.clone();
		System.out.println("after cloning the  listobj is:"+listobj);
//		
////		//By using retain method we can delete that collection from the list
//	list.retainAll(list1);
//		System.out.println("after retaining list1 the size of list is:"+list.size());
		
		//The ArrayList.get() method is used to get the element of a specified position within the list.
		System.out.println("get method:"+list.get(2));
		
//		The ArrayList.set() method is used to set an element in an ArrayList object at the specified index.
		list.set(2, (new Student(871,"hello","set@gmail.com")));
		System.out.println("after setting value:"+list.get(2));
		
		
	
		
		//The remove() method is used to remove an element at a specified index from ArrayList. 
//		Shifts any subsequent elements to the left (subtracts one from their indices).
		list.remove(2);
		System.out.println("now the value changes at index 2:"+list.get(2));
		
//		The removeAll() method is used to remove all the elements from a list that are contained in the specified collection.
		System.out.println("Before removing list1 from list the sie is:"+list.size());
		
		list.removeAll(list1);
		System.out.println("After removing list1 from list by using removeAll method the size is:"+list.size());
		System.out.println("Before clearing the list1 the size is:"+list1.size());
		
//		The clear() method is used to remove all of the elements from a list. 
//				The list will be empty after this call returns.
		list1.clear();
		System.out.println("after clearing the size is:"+list1.size());
		
			
	
	//using for each loop iterating values
	
	}
}
