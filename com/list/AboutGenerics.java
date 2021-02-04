package com.list;
	import java.util.ArrayList;
	import java.util.List;
	public class AboutGenerics {
			public static void main(String[] args) {
				
				
//				1.type safety
				List list = new ArrayList();    
				list.add(10);  
				list.add("10");  
								
				
//				With Generics, it is required to specify the type of object we need to store.  
				List<Integer> list1 = new ArrayList<Integer>();    
				list1.add(10);  
//				list1.add("10");//3.  compile-time error  
				
//				2.type casting			
				List<String> list3= new ArrayList<String>();
				list3.add("punati");
				String s = (String) list3.get(0);//type casting    
				
				
				
//				After Generics , we don't need to typecast the object.  
				List<String> list4 = new ArrayList<String>();    
				list4.add("hello");    
				
			}
}
