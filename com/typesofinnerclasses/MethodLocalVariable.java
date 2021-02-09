/*Method Local inner classes
Inner class can be declared within a method of an outer class.

Method Local inner classes can’t use local variable of outer method until that local variable is not declared as final
*/

package com.typesofinnerclasses;

public class MethodLocalVariable {
	//outer class method
	void outerMethod() { 
        System.out.println("inside outerMethod"); 
        
        // Inner class is local to outerMethod() 
        class Inner { 
        	//inner class method
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod(); 
    } 
}
class MethodDemo { 
    public static void main(String[] args) { 
    	
    	MethodLocalVariable x = new MethodLocalVariable(); 
        x.outerMethod(); 
    } 
} 