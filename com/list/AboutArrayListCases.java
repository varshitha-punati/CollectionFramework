package com.list;

import java.util.ArrayList;
import java.util.function.*;
public class AboutArrayListCases {
	public static void main(String[] args) {
		
		  // Creating empty ArrayList
		ArrayList<Object> list=new ArrayList<Object>();
		
		//adding values to the ArrayList 
//		list.add(1,new Student(571,"varshi","varshithapunati@gmail.com"));
		//IndexOutOfBoundsException − if the index is out of range.
		System.out.println(list.size());
		list.add(0,new Student(572,"yashu","yashupunati@gmail.com"));
//		list.add(2,new Student(573,"lakshmi","lakshmipunati@gmail.com"));
		list.add(new Student(575,"sailu","sailupunati@gmail.com"));
		
		
		// create an empty array list 
	    ArrayList<String> colorList = new ArrayList<String>();

	    // use add() method to add values in the list
	    colorList.add("White");
	    colorList.add("Black");
		colorList.add("Red");
	   
	   // create an empty array sample with an initial capacity 
		ArrayList<String> sample = new ArrayList<String>();
		
	   // use add() method to add values in the list 
	    sample.add("Green"); 
		sample.add("Red"); 
		sample.add("White");
			
	    System.out.println("First List :"+colorList) ;
		System.out.println("Second List :"+ sample);
		
//		The retainAll() method is used to remove it's elements from a list that are not contained in the specified collection.
		sample.retainAll(colorList);
		
		System.out.println("After applying the method, First List :"+ colorList);
		//so here in sample list the green is removed from the sample
		System.out.println("After applying the method, Second List :"+ sample);
		
	
		//printing colorlist
		for(Object s:colorList) {
			System.out.println(s);
		}
		
		}
}
