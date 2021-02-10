package com.list;

import java.util.Collections;
import java.util.Vector;

public class AboutVectorMethods {
	public static void main(String[] args) {
		//creating an empty vector
		Vector<String> v=new Vector<String>();
		
		//adding values to vector
		v.add("varshi");
		v.add("yashu");
		v.add("harish");
		v.add("sravya");
		
		
		System.out.print("Before sorting:");
		System.out.println(v);
		Collections.sort(v);
		System.out.print("after sorting:");
		System.out.println(v);
		
		Object[] arr=v.toArray();
		System.out.print("after converting into array:");
		System.out.println(v);
		
		
		System.out.println("By using streams");
		v.stream().forEach(s->System.out.println(s));
	}
}
