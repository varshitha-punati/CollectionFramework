package com.list;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class AboutLinkedlistTraversal {
public static void main(String[] args) {
	
		  // Creating empty LinkedList
				LinkedList<Object> list=new LinkedList<Object>();
				
				//adding values to the LinkedList 
//				The add method is used to add elements in that list
				list.add(new Student(571,"varshi","varshithapunati@gmail.com"));
				list.add(new Student(572,"yashu","yashupunati@gmail.com"));
				list.add(new Student(573,"lakshmi","lakshmipunati@gmail.com"));
				list.add(new Student(575,"sailu","sailupunati@gmail.com"));
				
				
				

			      /* For Loop for iterating LinkedList */
			      System.out.println("For Loop");
			      for (int counter = 0; counter < list.size(); counter++) { 		      
			          System.out.println(list.get(counter)); 		
			      }   		

			      /* Advanced For Loop*/ 		
			      System.out.println("Advanced For Loop"); 		
			      for (Object num : list) { 		      
			           System.out.println(num); 		
			      }

			      /* While Loop for iterating LinkedList*/ 		
			      System.out.println("While Loop"); 		
			      int count = 0; 		
			      while (list.size() > count) {
				 System.out.println(list.get(count));
			         count++;
			      }

			      /*Looping LinkedList using Iterator*/
			      System.out.println("Iterator");
			      
			      Iterator<Object> it = list.iterator();
			      while (it.hasNext()) {
			         System.out.println(it.next());
			      }
			      
			   // Get the Enumeration object
			      Enumeration<Object> e = Collections.enumeration(list);
			 
			      // Enumerate through the LinkedList elements
			      System.out.println("LinkedList elements using enumeration: ");
			      while(e.hasMoreElements())
			      System.out.println(e.nextElement());
			      
			      
			      //using stream forEach
			      System.out.println("using stream forEach");
			      list.stream().forEach(student -> System.out.println(student));
}
}
