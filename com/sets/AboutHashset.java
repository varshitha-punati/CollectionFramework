/*A Set is a Collection that cannot contain duplicate elements.
 *  It models the mathematical set abstraction.

The Set interface contains only methods inherited from Collection and 
adds the restriction that duplicate elements are prohibited.

Set also adds a stronger contract on the behavior of the equals and hashCode operations,
 allowing Set instances to be compared meaningfully even if their implementation types differ



HashSet:

The important points about Java HashSet class are:

HashSet stores the elements by using a mechanism called hashing.
HashSet contains unique elements only.
HashSet allows null value.
HashSet class is non synchronized.
HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
HashSet is the best approach for search operations.

*
*
*
*/

package com.sets;
import java.util.HashSet;
public class AboutHashset {
public static void main(String[] args) {
	
	//create an empty HashSet
	HashSet<Object> h1=new HashSet<Object>();
	
	//adding values to the HashSet
	h1.add(new Student(1,"varshi","varshithapunati@gmail.com"));
	h1.add(new Student(2,"akhila","akhilacherukuri@gmail.com"));
	h1.add(new Student(3,"koti","kotioruganti@gmail.com"));
	h1.add(new Student(4,"sai","sai@gmail.com"));
	h1.add(new Student(1,"varshi","varshithapunati@gmail.com"));
	
	//creating another hashSet
	HashSet<Object> h2=new HashSet<Object>();
	
	//adding values to the HashSet
	h2.add(new Student(5,"manisha","manishakunkn@gmail.com"));
	h2.add(new Student(6,"sravani","sravanipemmisani@gmail.com"));
	h2.add(new Student(7,"rushitha","rushithachirumamilla@gmail.com"));
	h2.add(new Student(8,"susmitha","susmithakata@gmail.com"));
	
	//adding all elements in the hashSet h2 to h1
	h1.addAll(h2);
	
	System.out.println(h1);
	
//	The containsAll() method of Java Set is used to check whether two sets contain the same elements or not. It takes one set as a parameter and returns
//	True if all of the elements of this set is present in the other set.
	System.out.println(h1.containsAll(h2));
	
//	printing hashCode
	System.out.println(h1.hashCode());
	System.out.println(h2.hashCode());
	
	System.out.println(h1.size());
	
	/*
	 * Object cloning refers to creation of exact copy of an object.
	 *  It creates a new instance of the class of current object and initializes all its fields 
	 with exactly the contents of the corresponding fields of this object.

	 */
	h2.clone();
	
	h1.remove(h2);
	System.out.println(h1);
	
	
}
}
