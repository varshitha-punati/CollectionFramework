# CollectionFramework
### what is collection?
- Group of Objects is a collection
- For example:
- We have multiple students in a class student1,student2,student3 these all together are called as collection of students
- So,Collection is a single entity representing multiple Objects
### What is collection Framework?
- In java, to represent the group of objects in  to a single Entity we need certain number of classes and Interfaces.
- So,collectionFramework defines that  different types interfaces and classes by which  we can represent  the group of Objects into a collection
### Why do we need Collection?
- suppose I want to store 100 elements.
- so,first I used variable to store the elements
	int a=1;
	int b=2;
	---------100;
- It is very typical for storing 100 elements using variables
-	so,I  used array to store the elements
-	int arr[]=new size[5];
-	So,By using array I used to store the elements
-	But In arrays there are some disadvantages of Arrays
-	In object array problem is limited size i.e
	1. Fixed in size(are not growable in nature)
	2. Suppose the size is 5 if i used only 3 memory Location then wastage of Memory.
	3. They will not use any underlying datastructure.so,it cannot support any readymade 	methods..means i want to sort or search an element there will be no predefined 	methods
-	So to overcome these problems we use collectionFramework
* Advantages of collection types:
1. Growable in nature
2. Homogeneous dataelements and Hetrogeneous element
3. Implemented by using underlying datastructure.
- eg:if I created an arraylist we need not to write the logic for sort serach etc.. there are readymade methods available like sort,search
### what are interfaces and classes available in collection framework?
## collection interface:
-	It is root interface 
-	In collection Interface is used to represent group of objects as single entity and which contains common methods which are required for other collections.
### what is Collections?
-	Collections in java is a  predefined class which is from java.util package
-	Collections contains some methods those methods are used to perform several opeartions on collection Objects
-	Collection interface contains child Interface like list interface,Set interface and Queue inteface.
### List Interface:
-	List is a child interface on collection Interface.
-	Store group of elements in sorted Order
-	Whatever i entered in the collection same order should maintain i.e. , Insertion Order should be mainted.
-	duplicates also should allow In thoses cases we go for List
* List classes:
- list is implemented by these classes.
1. ArrayList
2. LinkedList
3. Vector--legacy classes
### Set Interface :
- Set is a child interface on collection Interface.
- insertion order not preserved.
- duplicates not allowed.
* Set classes:
- set is implemented by these classes.
1. Hashset
2. LinkedHashset
3. TreeSet

### Queue:(Extends Collection Interface)
- Queue is child  interface of Collection Interface.
- Suppose we have different list of Emails eg having 1000 emails if i want to send the the mail to this 1000 emails we can send the mail to all at sametime..first it will send to first guy and after 2nd,3rd like that..
* Queue classes:
-	Queue is implemnted by these classes.
1. PriorityQueue

### Map interface:
- Map does not extends Collection Interface
- A map contains values on the basis of key, i.e. key and value pair. Each key and value pair is known as an entry. A Map contains unique keys.
-	A Map is useful if you have to search, update or delete elements on the basis of a key.
* Map classes:
- Map is implemented by these classes.
1. HashMap
2. LinkedHashMap
3. TreeMap
* Iterators:
- Iterators are used in Collection framework in Java to retrieve elements one by one. There are three iterators.
### Enumeration:
- It is a interface used to get elements of legacy collections(Vector, Hashtable). Enumeration is the first iterator present from JDK 1.0, rests are included in JDK 1.2 with more functionality.
- Here "v" is an Vector class object. e is of
- type Enumeration interface and refers to "v"
- Enumeration e = v.elements();
- There are two methods in Enumeration interface namely :
1. Tests if this enumeration contains more elements
public boolean hasMoreElements();
 2. Returns the next element of this enumeration 
// It throws NoSuchElementException
// if no more element present
public Object nextElement();
- Limitations of Enumeration :
- Enumeration is for legacy classes(Vector, Hashtable) only. Hence it is not a universal iterator.
-	Remove operations can’t be performed using Enumeration.
- Only forward direction iterating is possible.
### Iterator:
- It is a universal iterator as we can apply it to any Collection object. By using Iterator, we can perform both read and remove operations. 
- It is improved version of Enumeration with additional functionality of remove-ability of a element.
-	Iterator must be used whenever we want to enumerate elements in all Collection framework implemented interfaces like Set, List, Queue, Deque and also in all implemented classes of Map interface. Iterator is the only cursor available for entire collection framework.
-	Iterator object can be created by calling iterator() method present in Collection interface.
-	Iterator object can be created by calling iterator() method present in Collection interface.

- Here "c" is any Collection object. itr is of
- type Iterator interface and refers to "c"
- Iterator itr = c.iterator();
- Iterator interface defines three methods:

- Returns true if the iteration has more elements
public boolean hasNext();

// Returns the next element in the iteration
// It throws NoSuchElementException if no more 
// element present
public Object next();

// Remove the next element in the iteration
// This method can be called only once per call
// to next()
public void remove();

### Limitations of Iterator :

- Only forward direction iterating is possible.
-	Replacement and addition of new element is not supported by Iterator.
- Java ListIterator:
-	Like Iterator, ListIterator is a Java Iterator, which is used to iterate elements one-by-one from a List implemented object.
-	It is available since Java 1.2.
-	It extends Iterator interface.
-	It is useful only for List implemented classes.
-	Unlike Iterator, It supports all four operations: CRUD (CREATE, READ, UPDATE and DELETE).
-	Unlike Iterator, It supports both Forward Direction and Backward Direction iterations.
-	It is a Bi-directional Iterator.
- What is CRUD operations in Collection API?
- CREATE: Adding new elements to Collection object.
- READ: Retrieving elements from Collection object.
- UPDATE: Updating or setting existing elements in Collection object.
- DELETE: Removing elements from Collection object.
### Comparator Interface:
-	Java Comparator interface is used to order the objects of a user-defined class.
-	This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) and equals(Object element).
-	It provides multiple sorting sequences, i.e., you can sort the elements on the basis of any data member, for example, rollno, name, age or anything else.
- public int compare(Object obj1, Object obj2):
-	It compares the first object with the second object.
- public boolean equals(Object obj):	
-	It is used to compare the current object with the specified object.
- public boolean equals(Object obj):	
-	It is used to compare the current object with the specified object.
### Comparable interface:
-	Java Comparable interface is used to order the objects of the user-defined class. 
-	This interface is found in java.lang package and contains only one method named compareTo(Object). 
-	It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only. 
- For example, it may be rollno, name, age or anything else.
- compareTo(Object obj) method:
- public int compareTo(Object obj): It is used to compare the current object with the specified object. It returns
- positive integer, if the current object is greater than the specified object.
- negative integer, if the current object is less than the specified object.
- zero, if the current object is equal to the specified object.
### Difference between Comparator and Comparable Interface
-	comparable and comparator both are interfaces provide way of sorting to group of object or Collection.
-	comparable interface is present in java.lang package.
-	comparator interface is present in java.util package.
-	Comparable interface can be used to achieve single way of sorting like ascending or descending sorting order for numerical collection or alphabetical for string object collection
-	comparator interface  can be used to acheive multiple way of sorting.
without comparable and comparator interface :
-	Array.sort method from java.util.Arrays class can be used to sort primitive type arrays.
-	collections.sort method from java.util.Collections class can be used to sort Object Arrays.

### Functional programming:
- Upto java7  java is object oriented programming it means it supports only oops features.
- From java8 to we are allowed to develop functional programming style of programs also..means there is no change in syntax but it is additional to add for oops
- By using functional programming we can pass a function as argument to a method
- Upto java 7 we can pass only primitive value as argument or 1 class object as argument but you cannot pass function as argument to a method but from java8 it is possible

- COLLECTIONS:
- If we want to represent group of objects as single entity then we should go for collections
### STREAMS:
- stream api is used to process collections of objects.
- A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result
- A stream is not a data structure instead it takes input from the collections,Arrays or I/O channels.
- Streams don't change the original dtat structure instead it takes input from the collections,Arrays or I/o channels.
### why do we need stream
- Functinal programming:It means if i had a functional interface then represent it with lambda expression
- Code reduce:so,if we write in lambda expression then the length of code is reduced.
- Bulk opeartions:As compared to traditional approach stream will provide better approach
- If we want  to process the object from the collection.
- The iostreams are different from the collection streams 
- collections streams are used to process the stream of objects but in iostreams are used to process the data.
- if you want to get the stream ,stream method is used i.e., 
	Stream s=c.stream();
	Streams are present in java.util.stream pakg;
- Stream is an interface
- filter method():To filter elements based on conditions
- map method():for every object we want to a new object after applying something and generate a new object

# Inner Classes:
- In Java, just like methods, variables of a class too can have another class as its member. 
- Writing a class within another is allowed in Java. 
- The class written within is called the nested class, and the class that holds the inner class is called the outer class.
- Inner classes are a security mechanism in Java.
- We know a class cannot be associated with the access modifier private, but if we have the class as a member of other class, then the inner class can be made private.
- And this is also used to access the private members of a class.
- once you declare an inner class private, it cannot be accessed from an object outside the class.
- If the innerClass is static then we can write main method but if it is non- static we cannot access.
- If the innerclass is non-static it can access both static or non-static variables in outer class
- But you have static innerClass then it will not allow the non-static variables.
- The innerclass object is depends on outerclass
- For example: Building is outer class
- Apartment is innerClass(To access apartment you should first enter into building)
- So,If you want to access any innerClass methods first you should access the outerclass and based on outerclass reference you will access the innerClass  
- Inner class is a part of nested class. Non-static nested classes are known as inner classes.

## Types of Nested classes
- There are two types of nested classes non-static and static nested classes.The non-static nested classes are also known as inner classes.
1. Non-static nested class (inner class)
- Member inner class
- Anonymous inner class
- Local inner class
2. Static nested class

i. Member Inner Class:
- A class created within class and outside method.

ii. Anonymous InnerClass:
- A class created for implementing interface or extending class.
- Its name is decided by the java compiler.

iii. Local Inner Class:
- A class created within method.

2. Static Nested Class:
- A static class created within class.
