package com.streams;
import java.util.*;
public class StreamMethods {
	public static void main(String[] args) {
			List<Integer> l1=new ArrayList<Integer>();
			l1.add(11);
			l1.add(12);
			l1.add(13);
			l1.add(14);
			l1.add(15);
			l1.stream().filter(list->(list%2==0)).forEach(list->System.out.println(list));;
			l1.stream().map(list1->(list1+5)).forEach(list1->System.out.println(list1));;
	}
}
