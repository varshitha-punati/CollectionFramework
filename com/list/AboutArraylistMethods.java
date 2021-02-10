package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class AboutArraylistMethods {
	public static void main(String[] args) {
		
		  // Creating empty ArrayList
				ArrayList<String> list=new ArrayList<String>();
				
				//adding values to the ArrayList 
//				The add method is used to add elements in that list
				list.add("varshi");
				list.add("yashu");
				list.add("lakshmi");
				list.add("sailu");
				
				

		        // Get the array of the elements 
		        // of the ArrayList 
		        // using toArray() method 
//				An array containing the elements of an ArrayList object in proper sequence
//				The toArray() method is used to get an array which contains all the elements in ArrayList object in proper sequence (from first to last element).
				
		        Object[] arr = list.toArray(); 
		       
		        
		        System.out.println(arr);
		        System.out.println("Elements of ArrayList"
                        + " as Array: "
                        + Arrays.toString(arr)); 
		        
		        
		        // getting the subList 
	            // using subList() method 
	            List<String> arrlist = list.subList(2, 4); 
	            
	            // print the subList 
	            System.out.println("Sublist of arrlist: "+ arrlist); 
	            
	         // Get a Stream from the ArrayList.
	            Stream<String> stream = list.stream();
	            System.out.println("stream:");
	            stream.forEach(s->System.out.println(s));
	            
	         // printing the unsorted ArrayList  
	            System.out.println("Before sorting:");
	            System.out.println(list);
	            Collections.sort(list);
	            
	         // printing the sorted ArrayList  
	            System.out.print("After sorting:");
	            System.out.println(list);
	            Collections.reverse(list);
	            System.out.println(list);
	            
	            
	         
	        		
	        	
	}
}
