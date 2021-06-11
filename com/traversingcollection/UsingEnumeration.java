package com.traversingcollection;

import java.util.Enumeration;
import java.util.Vector;

public class UsingEnumeration {
	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		v.add(6);
		
		Enumeration<Integer> e=v.elements();
		
		 while (e.hasMoreElements()) {
	            System.out.println(e.nextElement());
	        }
		
	}
}
