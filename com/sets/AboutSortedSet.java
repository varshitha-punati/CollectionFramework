package com.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class AboutSortedSet {
	public static void main(String[] args) {
	
		SortedSet<Integer> s=new TreeSet<Integer>();
		
		//adding elements to TreeSet
		s.add(1);
		s.add(73);
		s.add(14);
		s.add(63);
		
		//adding duplicate element
		s.add(1);
		
		System.out.println(s);
		
//		This method returns the first(lowest) element present in this set.
		System.out.println("first method"+s.first());
		
//		This method returns the last(highest) element present in the set.
		System.out.println("last method"+s.last());
		
//		This method returns the elements which are 
//		less than the element that are present in the sorted set.
		System.out.println("headset"+s.headSet(63));
		
//		This method returns the elements which are greater 
//		than or equal to the element that are present in the sorted set.
		System.out.println("Tailset"+s.tailSet(63));
		
//		This method returns a sorted subset from the set 
//		containing the elements between element1 and element2.
		System.out.println("Subset"+s.subSet(14, 73));
		
		System.out.println("Comparator:"+s.comparator());
	}
}
