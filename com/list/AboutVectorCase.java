package com.list;
	import java.util.Vector;
public class AboutVectorCase {
	public static void main(String[] args) {
		
		
		//creating an empty Vector
		Vector<Integer>v=new Vector<>();
		
		//adding values to Vector
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		
		//printing the values 
		System.out.println("v:"+v);
		
		
		//creating an  another empty Vector
		Vector<Integer> v1=new Vector<Integer>();
		
		//adding values to Vector
		v1.addElement(1);
		v1.addElement(2);
		v1.addElement(5);
		v1.addElement(4);
		
		//printing the values 
		System.out.println("v1:"+v1);
		
		//if the values of v1 are not present in v ..then that elements are removed in v1
		v1.retainAll(v);
		
		System.out.println("v1:"+v1);
		System.out.println("v:"+v);
		
		//clear() method is used to remove all the elements from a List
		v1.clear();
		System.out.println("After clearing the size of v1 is:"+v1.size());
		
		
//		The insertElementAt() method of Java Vector class is used to
//		insert the specified object as a component in this vector at the specified index.
		v.insertElementAt(100, 0);
		System.out.println("v is:"+v);
		
		
	}	
}
