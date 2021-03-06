package com.sets;



import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Spliterator;
import java.util.Iterator;
public class AboutLinkedHashsetTraversal {

	public static void main(String[] args) {

		//create an empty LinkedHashSet
		LinkedHashSet<Object> h1=new LinkedHashSet<Object>();
		
		//adding values to the LinkedHashSet
		h1.add(new Student(1,"varshi","varshithapunati@gmail.com"));
		h1.add(new Student(2,"akhila","akhilacherukuri@gmail.com"));
		h1.add(new Student(3,"koti","kotioruganti@gmail.com"));
		h1.add(new Student(4,"sai","sai@gmail.com"));
		
		
		

	     
	      /* Advanced For Loop*/ 		
	      System.out.println("Advanced For Loop"); 		
	      for (Object num : h1) { 		      
	           System.out.println(num); 	
	          
	      }

	      
	      /*Looping LinkedHashSet using Iterator*/
	      System.out.println("Iterator");
	      
	      Iterator<Object> it = h1.iterator();
	      while (it.hasNext()) {
	         System.out.println(it.next());
	      }
	      
	   // Get the Enumeration object
	      Enumeration<Object> e = Collections.enumeration(h1);
	 
	      // Enumerate through the  LinkedHashSet elements
	      System.out.println(" LinkedHashSet elements using enumeration: ");
	      while(e.hasMoreElements())
	      System.out.println(e.nextElement());
	      
	      
	      //using stream forEach
	      System.out.println("using stream forEach");
	      h1.stream().forEach(student -> System.out.println(student));
	      
	      Spliterator<Object> s=h1.spliterator();
	      System.out.println("By using split iterator");
	      s.forEachRemaining(l->System.out.println(l));
	      
	}
}
