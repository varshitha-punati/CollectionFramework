/*There are four ways to loop ArrayList:
1.For Loop
2.Advanced for loop
3.While Loop
4.Iterator
*/

package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Enumeration;
import java.util.Collections;

public class AboutArraylistTraversal {
	public static void main(String[] args) {
		  // Creating empty ArrayList
				ArrayList<Object> list=new ArrayList<Object>();
				
				//adding values to the ArrayList 
//				The add method is used to add elements in that list
				list.add(new Student(571,"varshi","varshithapunati@gmail.com"));
				list.add(new Student(572,"yashu","yashupunati@gmail.com"));
				list.add(new Student(573,"lakshmi","lakshmipunati@gmail.com"));
				list.add(new Student(575,"sailu","sailupunati@gmail.com"));
				
				System.out.println();

			      /* For Loop for iterating ArrayList */
			      System.out.println("For Loop");
			      for (int counter = 0; counter < list.size(); counter++) { 		      
		          System.out.println(list.get(counter)); 		
			      }   		

			      /* Advanced For Loop*/ 		
			      System.out.println("Advanced For Loop"); 		
			      for (Object num : list) { 		      
			           System.out.println(num); 		
			      }

			      /* While Loop for iterating ArrayList*/ 		
			      System.out.println("While Loop"); 		
			      int count = 0; 		
			      while (list.size() > count) {
				 System.out.println(list.get(count));
			         count++;
			      }

			      /*Looping Array List using Iterator*/
			      System.out.println("Iterator");
			      
			      Iterator it = list.iterator();
			      while (it.hasNext()) {
			         System.out.println(it.next());
			      }
			      
			      
			         // Getting Spliterator
			        	Spliterator<Object> namesSpliterator = list.spliterator();
			        	
			        	// Traversing elements
			        	System.out.println("split iterator");
			        	namesSpliterator.forEachRemaining(System.out::println);	
			      
			   // Get the Enumeration object
			      Enumeration<Object> e = Collections.enumeration(list);
			
			      // Enumerate through the ArrayList elements
			      System.out.println("ArrayList elements using enumeration: ");
			      while(e.hasMoreElements())
			      System.out.println(e.nextElement());
			      
			      
			      //using stream forEach
			      System.out.println("using stream forEach");
			      list.stream().forEach(student -> System.out.println(student));
	}

	private static void getArrayListCapacity(ArrayList<Object> list) {
		// TODO Auto-generated method stub
		
	}
}
