package com.sets;
import java.util.HashSet;
public class AboutHashsetCases {
	public static void main(String[] args) {
		
		//creating an empty hashSet
		HashSet<String> cars = new HashSet<String>();
		
		//adding values to hashSet
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    cars.add("BMW");
	    
	    //printing the values to hashSet
	    System.out.println(cars);
	    
	  

	    /*The contains(Object element) of java.util.Collection interface is used 
	     		to check whether the element ‘element’ exists in this collection.
	     *  This method returns a boolean value depicting the presence of the element. 
	     * If the element is present, it returns true, else it returns false.
	     */
	    System.out.println(cars.contains("BMW"));
	    System.out.println(cars.size());
	    cars.remove("Ford");
	    System.out.println(cars.size());
	    //clear method is used to clear the elements in the cars HashSet
	    cars.clear();
	    
	    //The size() method of set interface in Java is used to get the number of elements in this list
	    System.out.println(cars.size());
	}
}
