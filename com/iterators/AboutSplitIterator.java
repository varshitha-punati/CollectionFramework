package com.iterators;

import java.util.ArrayList;
import java.util.Spliterator;

public class AboutSplitIterator {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> list1 = new ArrayList<>();
        
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("e");
		
		
		Spliterator<String> spliterator = list.spliterator();
		Spliterator<String> split = list1.spliterator();
//		System.out.println(split.estimateSize());
//		System.out.println(split.getExactSizeIfKnown());
//		
//		System.out.println(spliterator.estimateSize());
//		System.out.println(spliterator.getExactSizeIfKnown());
		
//		 System.out.println("using forEachRemaining in split Iterator:");
//		spliterator.forEachRemaining(System.out::println);
		
//		Spliterator<String> spliterator1 = spliterator.trySplit();
		
		Spliterator<String> spliterator1 = list.spliterator();
		Spliterator<String> spliterator2 = spliterator1.trySplit();
		 
		spliterator1.forEachRemaining(System.out::println);
		 
		System.out.println("========");
		
		spliterator2.forEachRemaining(System.out::println);
	}
}
