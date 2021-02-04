/*Vector implements a dynamic array. 
 * It is similar to ArrayList, but with two differences −
Vector is synchronized.
Vector contains many legacy methods that are not part of the collections framework.
Vector proves to be very useful if you don't know the size of the array in 
advance or you just need one that can change sizes over the lifetime of a program.
*/

package com.list;
import java.util.Vector;
public class AboutVector {
	public static void main(String[] args) {
		
		// Creating empty vector
		Vector<Object> v=new Vector<Object>();
		
		//adding elements to the vector v
		v.addElement(new Student(1,"a","a@gmail.com"));
		v.addElement(new Student(2,"b","b@gmail.com"));
		v.addElement(new Student(3,"c","c@gmail.com"));
		v.addElement(new Student(4,"d","d@gmail.com"));
		v.addElement(new Student(5,"e","e@gmail.com"));
		

		//printing size of the vector
		System.out.println("size of the vector using size method:"+v.size());
		
		//creating another empty vector
		Vector<Object> v1=new Vector<Object>();
		
		//adding elements to the vector v1
		v1.addElement(new Student(6,"f","f@gmail.com"));
		v1.addElement(new Student(7,"H","h@gmail.com"));
		v1.addElement(new Student(8,"i","i@gmail.com"));
		v1.addElement(new Student(9,"j","j@gmail.com"));
		
		
		
		//printing size of the vector
		System.out.println("size of the vector using size method:"+v1.size());
		
		//adding one vector to another vector
		v.addAll(v1);
		
		//again printing the size of the method
		 System.out.println("size of the vector using size method:"+v.size());
		

		for(Object s:v) {
			System.out.println(s);
		}
	
		
		System.out.println("first elemnt:"+v.firstElement());
		System.out.println("last element:"+v.lastElement());
		
		//removing the element at index 5
		v.removeElementAt(5);
		
		
		
		System.out.println(v);
		
	}
}
