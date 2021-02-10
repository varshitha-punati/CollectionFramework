package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Spliterator;
import java.util.Iterator;
public class AboutHashMapTraversal {
	public static void main(String[] args) {
		
		//creating an empty hashMap
		HashMap<Integer,Object> m=new HashMap<Integer,Object>();
		
		
		m.put(5,new Student(573,"varshi","varshithapunati@gmail.com"));
		m.put(3,new Student(561,"akhila","akhilacherukuri@gmail.com"));
		m.put(2,new Student(571,"koti","kotioruganti@gmail.com"));
		m.put(1,new Student(563,"sai","sai@gmail.com"));

	
		// using for-each loop for iteration over Map.entrySet() 
        for (Map.Entry<Integer,Object> entry : m.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); 
		
        // using keySet() for iteration over keys 
        for (Integer student : m.keySet())  
            System.out.println("key: " + student); 
          
        // using values() for iteration over keys 
        for (Object details: m.values())  
            System.out.println("value: " + details); 
        
        
        
        // using iterators 
        Iterator<Map.Entry<Integer,Object>>itr = m.entrySet().iterator(); 
          
        while(itr.hasNext()) 
        { 
             Map.Entry<Integer,Object> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
        
        
        
     // forEach(action) method to iterate map 
        System.out.println("forEach");
        m.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v)); 
	
        
	}
}