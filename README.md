# CollectionFramework

# Inner Classes:
-In Java, just like methods, variables of a class too can have another class as its member. 
- Writing a class within another is allowed in Java. 
- The class written within is called the nested class, and the class that holds the inner class is called the outer class.
- Inner classes are a security mechanism in Java.
- We know a class cannot be associated with the access modifier private, but if we have the class as a member of other class, then the inner class can be made private.
 And this is also used to access the private members of a class.
-once you declare an inner class private, it cannot be accessed from an object outside the class.
-If the innerClass is static then we can write main method but if it is non- static we cannot access.
-If the innerclass is non-static it can access both static or non-static variables in outer class
-But you have static innerClass then it will not allow the non-static variables.
-The innerclass object is depends on outerclass
-For example: Building is outer class
		#Apartment is innerClass(To access apartment you should first enter into building)
-So,If you want to access any innerClass methods first you should access the outerclass and based on outerclass reference you will access the innerClass  
-Inner class is a part of nested class. Non-static nested classes are known as inner classes.
## Types of Nested classes
-There are two types of nested classes non-static and static nested classes.The non-static nested classes are also known as inner classes.
-1.Non-static nested class (inner class)
	--i.Member inner class
	--ii.Anonymous inner class
	--iii.Local inner class
-2.Static nested class

-i.Member Inner Class:A class created within class and outside method.
-ii.Anonymous InnerClass:A class created for implementing interface or extending class. Its name is decided by the java compiler.
-iii.Local Inner Class:A class created within method.
-2.Static Nested Class:A static class created within class.
