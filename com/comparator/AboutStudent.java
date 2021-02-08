package com.comparator;
import java.util.ArrayList;
import java.util.Collections;
public class AboutStudent {
	
	public static void main(String[] args) {
		//create an empty arraylist
		ArrayList<Student> list=new ArrayList<Student>();
		
		//assigning values to the arrayList
		list.add(new Student("varshi",573));
		list.add(new Student("harish",563));
		list.add(new Student("yashu",590));
		
		//sort method
		Collections.sort(list);
		
		//enhanced for loop
		for(Student s:list) {
			System.out.println(s);
		}
	}
}
