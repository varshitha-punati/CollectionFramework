/*
 * 
 * Comparable Interface:
 * 
 * Java Comparable interface is used to order the objects of the user-defined class. 
 * This interface is found in java.lang package and contains only one method named compareTo(Object). 
 * It provides a single sorting sequence only, i.e., 
 * you can sort the elements on the basis of single data member only.
 * 
 * compareTo(Object obj) method:
 * 
public int compareTo(Object obj): 
It is used to compare the current object with the specified object. It returns
positive integer, if the current object is greater than the specified object.
negative integer, if the current object is less than the specified object.
zero, if the current object is equal to the specified object.
 * 
 * 
 */
package com.comparator;
import java.util.ArrayList;
import java.util.Collections;

public class AboutComparable {
	
	public static void main(String[] args) {
		//creating an empty ArrayList
		ArrayList<Laptop> lap=new ArrayList<Laptop>();
		
		//assigning values to the list
		lap.add(new Laptop(1000,"Dell",5));
		lap.add(new Laptop(900,"Lenovo",4));
		lap.add(new Laptop(1100,"Hp",4));
		
		//sort method
		Collections.sort(lap);
		for(Laptop l:lap) {
			System.out.println(l);
		}
		
	}
}
