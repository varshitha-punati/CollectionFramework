package com.sets;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;

public class AboutTreesetTraversal {
	public static void main(String[] args) {
		//create an empty TreeSet
		TreeSet<String> set=new TreeSet<String>();  
		
		//adding values to TreeSet
        set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        
        

	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (Object num : set) { 		      
	           System.out.println(num); 	
	          
	      }

	      
	      /*Looping TreeSet using Iterator*/
	      System.out.println("Iterator");
	      
	      Iterator<String> it = set.iterator();
	      while (it.hasNext()) {
	         System.out.println(it.next());
	      }
	      
	   // Get the Enumeration object
	      Enumeration<String> e = Collections.enumeration(set);
	 
	      // Enumerate through the  TreeSet elements
	      System.out.println(" TreeSet elements using enumeration: ");
	      while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	      
	      
	      //using stream forEach
	      System.out.println("using stream forEach");
	      set.stream().forEach(student -> System.out.println(student));
	      
	      Spliterator<String> s=set.spliterator();
	      System.out.println("By using split iterator");
	      s.forEachRemaining(t->System.out.println(t));
        
	}
}
