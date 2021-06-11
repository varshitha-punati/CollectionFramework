/*
 * Map interface is a special type of collection which is used to store key-value pairs.
 *  It does not extend Collection interface for this reason. 
 * A map contains values on the basis of key, i.e. key and value pair. 
 * Each key and value pair is known as an entry.
 *  A Map contains unique keys.
 *  
A Map is useful if you have to search, update or delete elements on the basis of a key.
Hashmap:
Java HashMap contains values based on the key.
Java HashMap contains only unique keys.
Java HashMap may have one null key and multiple null values.
Java HashMap is non synchronized.
Java HashMap maintains no order.
*
*
*/

package com.map;
import java.util.HashMap;


public class AboutHashmap {
	public static void main(String[] args) {
		
			//creating an empty hashMap
			HashMap<Integer,Object> m=new HashMap<Integer,Object>();
			
			//The java.util.HashMap.put() method of HashMap is used to insert a mapping into a map.
//			This means we can insert a specific key and the value it is mapping to into a particular map. 
//			If an existing key is passed then the previous value gets replaced by the new value. 
//			If a new pair is passed, then the pair gets inserted as a whole.
			m.put(5,new Student(573,"varshi","varshithapunati@gmail.com"));
			m.put(3,new Student(561,"akhila","akhilacherukuri@gmail.com"));
			m.put(2,new Student(571,"koti","kotioruganti@gmail.com"));
			m.put(1,new Student(563,"sai","sai@gmail.com"));
			
			//displaying the hashMap m
			System.out.println(m);
			
			//updating the key value 5 
			m.put(5,new Student(773,"varshi","varshithapunati@gmail.com"));
			
			
			
			//removing the key value of 2
			m.remove(2);
			
			//now displaying the m
			System.out.println(m);
			
			//updating the key value of 4
			m.put(4,new Student(573,"varshi","varshithapunati@gmail.com"));
			
			
//			The java.util.HashMap.get() method of HashMap class is used to retrieve or fetch the value
//				mapped by a particular key mentioned in the parameter. 
//			It returns NULL when the map contains no such mapping for the key.
			System.out.println(m.get(4));
			
//			The java.util.HashMap.keySet() method in Java is used to create a set out of the key elements contained in the hash map. 
//			It basically returns a set view of the keys or we can create a new set and store the key elements in them.
//			 // Using keySet() to get the set view of keys 
			System.out.println("keyset to get set views of keys:"+m.keySet());
			

			 // Using values() to get the set view of values 
			System.out.println(m.values());
			
//			The java.util.HashMap.containsKey() method is used to check whether 
//			a particular key is being mapped into the HashMap or not.
//			It takes the key element as a parameter and returns True if that element is mapped in the map.
			System.out.println(m.containsKey(4));
			
			// Displaying the size of the map 
			System.out.println(m.size());
			
			 // Displaying the HashMap 
	        System.out.println("Initial Mappings are: "+"\n" + m); 
	  
	        // Using entrySet() to get the set view     
			System.out.println("Using entrySet() to get the set view:"+"\n"+m.entrySet());
	}
}
