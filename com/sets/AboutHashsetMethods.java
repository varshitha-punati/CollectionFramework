package com.sets;

import java.util.HashSet;
import java.util.stream.Stream;

public class AboutHashsetMethods {
	public static void main(String[] args) {	

		//create an empty HashSet
		HashSet<Object> h1=new HashSet<Object>();
		
		//adding values to the HashSet
//		The add method is used to add elements in that list
		h1.add("varshi");
		h1.add("yashu");
		h1.add("lakshmi");
		h1.add("sailu");
		
		Object[] arr=h1.toArray();
		System.out.println("After converting  hashset to array");
		System.out.println(arr);
		
        
     // Get a Stream from the Hashset.
        Stream<Object> stream = h1.stream();
        System.out.println("stream:");
        stream.forEach(s->System.out.println(s));
        
	}
}
