package com.sets;
import java.util.TreeSet;
public class AboutTreesetCases {
	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();  
        set.add("A");  
        set.add("B");  
        set.add("C");  
        set.add("D");  
        set.add("E");  
        
        //displaying the set values
        System.out.println("Initial Set: "+set);  
          
        
//        It returns the elements in reverse order.
        System.out.println("Reverse Set: "+set.descendingSet());  
          
        
//        It returns the group of elements that are less than the specified element.
        System.out.println("Head Set: "+set.headSet("C"));  
         
//        It returns a set of elements that lie between the given
//        range which includes fromElement and excludes toElement.
        System.out.println("SubSet: "+set.subSet("A","E"));  
          
//        It returns a set of elements that are greater than or equal to the specified element.
        System.out.println("TailSet: "+set.tailSet("C", false));  
}    
	}

