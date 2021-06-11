/*
 * Java TreeMap contains values based on the key. 
 * It implements the NavigableMap interface and extends AbstractMap class.
	Java TreeMap contains only unique elements.
	Java TreeMap cannot have a null key but can have multiple null values.
	Java TreeMap is non synchronized.
	Java TreeMap maintains ascending order.
*/

package com.map;

import java.util.TreeMap ;
public class AboutTreeMap {
	public static void main(String[] args) {
		
		//create an empty treeMap
		TreeMap <Integer,Object> m=new TreeMap<Integer,Object>();
		
		// It is used to insert a specific key and the value it is mapping to into a particular map.
		m.put(5,new Student(573,"varshi","varshithapunati@gmail.com"));
		m.put(3,new Student(561,"akhila","akhilacherukuri@gmail.com"));
		m.put(2,new Student(571,"koti","kotioruganti@gmail.com"));
		m.put(1,new Student(563,"sai","sai@gmail.com"));
		
		//displaying treeMap m
		System.out.println(m);
		
		//removing the keyValue of 2 in m
		m.remove(2);
		
		//displaying treeMap m
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
		
//		The higherKey() method of java. util. TreeMap class is used to 
//		return the least key strictly greater than the given key, or null if there is no such key
		 System.out.println("higherkey:"+m.higherKey(2));
		 
//		 The lowerKey(K key) method is used to return the greatest key strictly less than
//		 the given key, or null if there is no such key.
		 System.out.println("lowerkey:"+m.lowerKey(2));
		
//		 The firstEntry() method is used to return a key-value 
//		 mapping associated with the least key in this map, or null if the map is empty.
		 System.out.println("FirstEntry:"+m.firstEntry());
		
//		create an empty treeMap
		TreeMap <Integer,Object> m1=new TreeMap<Integer,Object>();
		
//	inserting the key value of 1 and 2
		m1.put(1,new Student(100,"one","a@gmail.com"));
		m1.put(2,new Student(100,"two","b@gmail.com"));
		
//		It is used to return the first (lowest) key currently in this sorted map.
		 System.out.println(m1.firstKey());

		 //It is used to return the first (lowest) key currently in this sorted map.
				 System.out.println(m1.lastKey());
		 
		m.putAll(m1);
		
		
		//Returns key-value pairs whose keys are less than the specified key.  
	      System.out.println("headMap: "+m.headMap(3));  
	      //Returns key-value pairs whose keys are greater than or equal to the specified key.  
	      System.out.println("tailMap: "+m.tailMap(3));  
	      //Returns key-value pairs exists in between the specified key.  
	      System.out.println("subMap: "+m.subMap(1, 4));    
	


		
		
		
	}
}
