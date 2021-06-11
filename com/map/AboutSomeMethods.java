package com.map;

import java.util.LinkedList;
import java.util.List;

public class AboutSomeMethods {
	
		public static void main(String[] args) {
			
			  List<Character> list = new LinkedList<>();
			  List<Character> list1 = new LinkedList<>();
			  
			  for (char i='a';i<='z';i++) {
				  
				  	list.add(i);
			       }
	
					System.out.println(list.hashCode()); 
					System.out.println(list1.hashCode()); 
			  
			  
//			  System.out.print("Alphabet : ");
			  
//			  converting linkelist to array
			          Object[] a=list.toArray();
			          
			  System.out.println();
			 
//			  retrieving values from array
			 
//			  for(int i=0 ;i<a.length;i++){
//			  System.out.println( i++ +": "+ a[i]);
//			          }
			  
		}
}
		
