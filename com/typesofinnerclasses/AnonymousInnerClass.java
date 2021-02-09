/*Anonymous inner classes
 * 
Anonymous inner classes are declared without any name at all. They are created in two ways.

*/

package com.typesofinnerclasses;

public class AnonymousInnerClass {
	void show() { 
	      System.out.println("i am in show method of super class"); 
	   } 
}
class Sample { 
	  
	   //  An anonymous class with AnonymousInnerClass as base class 
	   static  AnonymousInnerClass obj = new  AnonymousInnerClass() { 
	       void show() { 
	           super.show(); 
	           System.out.println("i am in sample class"); 
	       } 
	   }; 
	   public static void main(String[] args){ 
	       obj.show(); 
	   } 
	}