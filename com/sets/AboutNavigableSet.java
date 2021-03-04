package com.sets;
import java.util.TreeSet;
public class AboutNavigableSet {
	public static void main(String[] args) {
TreeSet<Integer> s=new TreeSet<Integer>();
		
		//adding elements to TreeSet
		s.add(1);
		s.add(73);
		s.add(14);
		s.add(63);
		s.add(1);
		
		System.out.println(s);
		
//		Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
		System.out.println(s.lower(73));
		
//		Returns the least element in this set strictly greater than the given element, or null if there is no such element.
		System.out.println(s.higher(14));
		
//		Returns the least element in this set greater than or equal to the given element, or null if there is no such element.
		System.out.println(s.ceiling(60));
		
//		Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.
		System.out.println(s.floor(63));
		
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s);
		System.out.println(s.descendingSet());
	}
}
