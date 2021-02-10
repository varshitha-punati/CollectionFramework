package com.sets;

import java.util.TreeSet;
import java.util.stream.Stream;

public class AboutTreesetMethods {
	public static void main(String[] args) {

		//create an empty HashSet
		TreeSet<Object> t=new TreeSet<Object>();
		
		//adding values to the TreeSet
		t.add("varshi");
		t.add("yashu");
		t.add("lakshmi");
		t.add("sailu");
		
		Object[] arr=t.toArray();
		System.out.println("After converting  Treeset to array");
		System.out.println(arr);
		
        
     // Get a Stream from the Hashset.
        Stream<Object> stream =t.stream();
        System.out.println("stream:");
        stream.forEach(s->System.out.println(s));
	}
}
