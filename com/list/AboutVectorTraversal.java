package com.list;

import java.util.Vector;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Spliterator;

public class AboutVectorTraversal {
	public static void main(String[] args) {
		
			  // Creating empty vector
					Vector<Object> list=new Vector<Object>();
					
					//adding values to the vector
//					The add method is used to add elements in that list
					list.add(new Student(571,"varshi","varshithapunati@gmail.com"));
					list.add(new Student(572,"yashu","yashupunati@gmail.com"));
					list.add(new Student(573,"lakshmi","lakshmipunati@gmail.com"));
					list.add(new Student(575,"sailu","sailupunati@gmail.com"));
										

				      /* For Loop for iterating Vector */
				      System.out.println("For Loop");
				      for (int counter = 0; counter < list.size(); counter++) { 		      
				          System.out.println(list.get(counter)); 		
				      }   		

				      /* Advanced For Loop*/ 		
				      System.out.println("Advanced For Loop"); 		
				      for (Object num : list) { 		      
				           System.out.println(num); 		
				      }

				      /* While Loop for iterating Vector*/ 		
				      System.out.println("While Loop"); 		
				      int count = 0; 		
				      while (list.size() > count) {
					 System.out.println(list.get(count));
				         count++;
				      }

				      /*Looping vector using Iterator*/
				      System.out.println("Iterator");
				      
				      Iterator it = list.iterator();
				      while (it.hasNext()) {
				         System.out.println(it.next());
				      }
				      
				   // Get the Enumeration object
				      Enumeration<Object> e = Collections.enumeration(list);
				 
				      // Enumerate through the vector elements
				      System.out.println("vector elements using enumeration: ");
				      while(e.hasMoreElements())
				      System.out.println(e.nextElement());
				      
				      
				      //using stream forEach
				      System.out.println("using stream forEach");
				      list.stream().forEach(student -> System.out.println(student));
				      
				      
				    		// using spliterator() method 
						        Spliterator<Object> details = list.spliterator(); 
						  
						        // print result from Spliterator 
						        System.out.println("By using split iterator:"); 
						  
						        // forEachRemaining method of Spliterator 
						        details.forEachRemaining((n) -> System.out.println( n)); 	  
	}
}
