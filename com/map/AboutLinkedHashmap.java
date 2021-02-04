/*
 * LinkedHashMap:
 Java LinkedHashMap contains values based on the key.
Java LinkedHashMap contains unique elements.
Java LinkedHashMap may have one null key and multiple null values.
Java LinkedHashMap is non synchronized.
Java LinkedHashMap maintains insertion order.
*/

package com.map;
import java.util.LinkedHashMap;
public class AboutLinkedHashmap {
	public static void main(String[] args) {
		
		//creating an empty linkedhashmap
		LinkedHashMap <Integer,Object> m=new LinkedHashMap <Integer,Object>();
		
		// It is used to insert a specific key and the value it is mapping to into a particular map. 
		m.put(5,new Student(573,"varshi","varshithapunati@gmail.com"));
		m.put(3,new Student(561,"akhila","akhilacherukuri@gmail.com"));
		m.put(2,new Student(571,"koti","kotioruganti@gmail.com"));
		m.put(1,new Student(563,"sai","sai@gmail.com"));
		
		//displaying map m
		System.out.println(m);
		
		//removing the key  value of 2
		m.remove(2);
		
		//displaying map m
		System.out.println(m);
		
		//inserting the key value of 4
		m.put(4,new Student(573,"varshi","varshithapunati@gmail.com"));
		
		//retriving the value of a particular key mentioned
		System.out.println(m.get(4));
		
		 // Using keySet() to get the set view of keys 
		System.out.println(m.keySet());
		
//		It takes the key element as a parameter and returns True if that element is mapped in the map.
		System.out.println(m.containsKey(4));
		
		 // Using values() to get the set view of values 
		System.out.println(m.values());
		
		// Displaying the size of the map 
		System.out.println(m.size());
		
		 // Using entrySet() to get the set view  
		System.out.println(m.entrySet());
	}
}
