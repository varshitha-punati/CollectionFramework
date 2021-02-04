package com.collections;
import java.util.Collections; 
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class AboutCollection {
	public static void main(String[] args) {		     
		
		//creating an Empty ArrayList
		Collection<Integer> c=new ArrayList<Integer>();
		
	
//		Inserting values to ArrayList using add method
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		
		//creating an Empty ArrayList
		Collection<Integer> c1=new ArrayList<Integer>();
				
		//Inserting values to ArrayList using add method
		c1.add(1);
		c1.add(6);
		c1.add(4);
		c1.add(5);
		
		
		//7.retainAll:removes all the elements of c which are not present in c1
		System.out.println(c.retainAll(c1));
		
		//displaying c
		System.out.println("c is:"+c);
		
		//displaying c1
		System.out.println("c1 is:"+c1);
		
		//8.clear:Removes all elements from the  collection c.
		c.clear();
		
		//displaying c
		System.out.println("c is:"+c);
		
		//isEmpty method:Returns true if the collection c is empty. Otherwise, returns false.
		if(c.isEmpty()) {
			System.out.println("c is empty");
		}
		else {
			System.out.println("c is not empty");
		}
		    }    
	}
