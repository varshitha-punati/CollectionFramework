/* LinkedHashSet:
 * Java LinkedHashSet class is a Hashtable and Linked list implementation of the set interface. 
 * It inherits HashSet class and implements Set interface.
 * 
 * 
 * Java LinkedHashSet class contains unique elements only like HashSet.
	Java LinkedHashSet class provides all optional set operation and permits null elements.
	Java LinkedHashSet class is non synchronized.
	Java LinkedHashSet class maintains insertion order.

*/
package com.sets;

import java.util.LinkedHashSet;

public class AboutLinkedHashset {
	public static void main(String[] args) {
		
		//creating an empty linkedhashset 
		LinkedHashSet<Object> h1=new LinkedHashSet<Object>();
		
		//adding  values to linkedhashset
		h1.add(new Student(1,"varshi","varshithapunati@gmail.com"));
		h1.add(new Student(2,"akhila","akhilacherukuri@gmail.com"));
		h1.add(new Student(3,"koti","kotioruganti@gmail.com"));
		h1.add(new Student(4,"sai","sai@gmail.com"));
		
		//creating an empty linkedhashset 
		LinkedHashSet<Object> h2=new LinkedHashSet<Object>();
		
		//adding  values to linkedhashset
		h2.add(new Student(5,"manisha","manishakunkn@gmail.com"));
		h2.add(new Student(6,"sravani","sravanipemmisani@gmail.com"));
		h2.add(new Student(7,"rushitha","rushithachirumamilla@gmail.com"));
		h2.add(new Student(8,"susmitha","susmithakata@gmail.com"));
		
		//adding all the elements of h2 to h1
		h1.addAll(h2);
		
		//printing h1
		System.out.println(h1);
		//retruns true if h1 contains h2 elements
		System.out.println(h1.containsAll(h2));
		
		//displaying the size of the h1
		System.out.println(h1.size());
		
		//removing all the elements of h2
		h2.clear();
		//displaying h2
		System.out.println(h2);
	}
}
