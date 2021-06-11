package com.traversingcollection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		
		
		
		/*Looping Array List using Iterator*/
	      System.out.println("By using Iterator");
	      
	      Iterator<Integer> it = l.iterator();
	      Iterator<Integer> it1 = l.iterator();
	      System.out.println("Before removing elements are:");
	      
	      while(it1.hasNext()) {
	    	  System.out.println(it1.next());
	      }
//	      for (int p: l) {
//          System.out.println(p);
//       }
	      int i;
	      while (it.hasNext()) {
	    	  i = (Integer)it.next();
	        if(i==12) {
	        	it.remove();
	        }
	      }
	      System.out.println("removing element:12");
	      System.out.println("The remaining elements are:");
	      
	      
	      for (int s: l) {
	          System.out.println(s);
	       }
	     
	}
}
