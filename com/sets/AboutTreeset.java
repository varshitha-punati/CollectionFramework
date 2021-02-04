/*Java TreeSet class implements the Set interface that uses a tree for storage.
 *  It inherits AbstractSet class and implements the NavigableSet interface. 
 *  The objects of the TreeSet class are stored in ascending order.

The important points about Java TreeSet class are:

Java TreeSet class contains unique elements only like HashSet.
Java TreeSet class access and retrieval times are quiet fast.
Java TreeSet class doesn't allow null element.
Java TreeSet class is non synchronized.
Java TreeSet class maintains ascending order.
*/


package com.sets;
import java.util.TreeSet;
public class AboutTreeset {
	public static void main(String[] args) {
		//creating an empty TreeSet
		TreeSet<Object> t=new TreeSet<Object>();
		
		//adding values to Treeset
		t.add(new Student(4,"varshi","varshithapunati@gmail.com"));
		t.add(new Student(1,"akhila","akhilacherukuri@gmail.com"));
		t.add(new Student(2,"koti","kotioruganti@gmail.com"));
		t.add(new Student(11,"sai","sai@gmail.com"));
		
		//printing the TreeSet
		System.out.println(t);
		
		//creating an empty TreeSet
		TreeSet<Object> t1=new TreeSet<Object>();
		
		//adding values to Treeset
		t1.add(new Student(5,"manisha","manishakunkn@gmail.com"));
		t1.add(new Student(6,"sravani","sravanipemmisani@gmail.com"));
		t1.add(new Student(7,"rushitha","rushithachirumamilla@gmail.com"));
		t1.add(new Student(8,"susmitha","susmithakata@gmail.com"));
		
		//adding all elements of t1 to t
		t.addAll(t1);
		
		//displaying t1
		System.out.println(t);
		
	}
}
