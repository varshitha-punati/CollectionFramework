/*Inner class means one class which is a member of another class. There are basically four types of inner classes in java.
1) Nested Inner class
2) Method Local inner classes
3) Anonymous inner classes
4) Static nested classes


Nested Inner class:
Nested Inner class can access any private instance variable of outer class. 
Like any other instance variable, we can have access modifier private, protected, public and default modifier.
Like class, interface can also be nested and can have access specifiers.

*/
package com.typesofinnerclasses;

public class NestedInnerClass {
	// Simple nested inner class 
	   class Inner { 
	      public void show() { 
	           System.out.println("In a nested class method"); 
	      } 
	   } 
	   
	   /*
	    * Error illegal static declaration in inner class 
Outer.Inner public static void main(String[] args) 
modifier ‘static’ is only allowed in constant 
variable declaration 
*/
	   
//	   class Main { 
//		   public static void main(String[] args) { 
//			   NestedInnerClass.Inner in = new  NestedInnerClass().new Inner(); 
//		       in.show(); 
//		   } 
//		} 
}
class Main { 
	   public static void main(String[] args) { 
		   NestedInnerClass.Inner in = new  NestedInnerClass().new Inner(); 
	       in.show(); 
	   } 
	} 
