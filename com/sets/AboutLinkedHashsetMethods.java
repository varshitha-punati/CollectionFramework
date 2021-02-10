package com.sets;

import java.util.LinkedHashSet;
import java.util.stream.Stream;

public class AboutLinkedHashsetMethods {
	public static void main(String[] args) {
		//create an empty HashSet
				LinkedHashSet<Object> h1=new LinkedHashSet<Object>();
				
				//adding values to the LinkedHashSet
				h1.add("varshi");
				h1.add("yashu");
				h1.add("lakshmi");
				h1.add("sailu");
				
				Object[] arr=h1.toArray();
				System.out.println("After converting  Linkedhashset to array");
				System.out.println(arr);
				
		        
		     // Get a Stream from the LinkedHashset.
		        Stream<Object> stream = h1.stream();
		        System.out.println("stream:");
		        stream.forEach(s->System.out.println(s));
	}
}
