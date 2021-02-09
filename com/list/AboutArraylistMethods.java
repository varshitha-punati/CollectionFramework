package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class AboutArraylistMethods {
	public static void main(String[] args) {
		
		  // Creating empty ArrayList
				ArrayList<Object> list=new ArrayList<Object>();
				
				//adding values to the ArrayList 
//				The add method is used to add elements in that list
				list.add(new Student(571,"varshi","varshithapunati@gmail.com"));
				list.add(new Student(572,"yashu","yashupunati@gmail.com"));
				list.add(new Student(573,"lakshmi","lakshmipunati@gmail.com"));
				list.add(new Student(575,"sailu","sailupunati@gmail.com"));
				
				

		        // Get the array of the elements 
		        // of the ArrayList 
		        // using toArray() method 
//				An array containing the elements of an ArrayList object in proper sequence
//				The toArray() method is used to get an array which contains all the elements in ArrayList object in proper sequence (from first to last element).
				
		        Object[] arr = list.toArray(); 
		        System.out.println(list);
		        System.out.println(arr);
		        System.out.println("Elements of ArrayList"
                        + " as Array: "
                        + Arrays.toString(arr)); 
		        
		        
		        // getting the subList 
	            // using subList() method 
	            List<Object> arrlist2 = list.subList(2, 4); 
	            
	            // print the subList 
	            System.out.println("Sublist of arrlist: "+ arrlist2); 
	            
	         // Get a Stream from the ArrayList.
	            Stream<Object> stream = list.stream();
	         
	        		
	        	
	}
}
