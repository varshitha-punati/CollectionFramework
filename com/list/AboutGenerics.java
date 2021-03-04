package com.list;
	import java.util.ArrayList;
	import java.util.List;
	public class AboutGenerics {
		
			public static void main(String[] args) {
				 
				String s[]=new String[5];
				s[0]="a";
				s[1]="b";
//				s[2]=2;
				
				String s1=s[0];
				
				
				ArrayList<String> l=new ArrayList<String>();
				l.add("a");
				l.add("b");
				
				
				
				 
//				1.type safety
				List list = new ArrayList();    
				list.add(10);  
				list.add("10");  							
				
//				With Generics, it is required to specify the type of object we need to store.  
				List<Integer> list1 = new ArrayList<Integer>();    
				list1.add(10);  
//				list1.add("10");//3.  compile-time error  
				
//				2.type casting			
				List list3= new ArrayList();
				list3.add("punati");
				list3.add(1);
				System.out.println(list3.get(0));
				System.out.println(list3.get(1));
//				String s = (String) list3.get(0);//type casting    
				
				
				
//				After Generics , we don't need to typecast the object.  
				List<String> list4 = new ArrayList<String>();    
				list4.add("hello");   
				
//				So, anything that is used as generics has to be convertable to Object (in this example get(0) returns an Object), and the primitive types aren't. 
//				So they can't be used in generics.

				
			}
}
