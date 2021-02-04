package com.streams;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AboutStreams {

	
	public static void main(String[] args) {
		
		//by using array
		String subjects[]= {"Hindi","English","Science","Telugu"};
		List<String> l0=Arrays.asList(subjects);
		Stream<String> stream=Arrays.stream(subjects);
		Iterator it=stream.iterator();
		
		
		//first create a stream from an existing arraylist
		List l1=new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(5);
		l1.add(6);
		Stream l2=l1.stream();
		l2.forEach(b->System.out.println(b));
		
		
		//creating an empty Stream
		Stream<String> stream1=Stream.empty();
		
		//creating infinite stream using iterate()
		Stream<Integer> stream2=Stream.iterate(2, (Integer n)->n*2).limit(10);
		
		
		//create infinite stream using generate
		Stream<Double> stream3=Stream.generate(Math::random).limit(10);
		
		//create infinite stream using predicate
		Pattern p=Pattern.compile("^E");
		Stream<String> stream4 = l0.stream().filter(p.asPredicate());
		stream4.forEach(s->System.out.println(s));
		
		//creating streams from iterator
		Iterator<String> itr=l0.iterator();
		
		
		//by using of method creating stream
		Stream<String> s1=Stream.of("varshi");
		Stream<String>	s2=Stream.of("punati","yashu","varshi");
		System.out.println("s1:");
		s1.forEach(s->System.out.println(s));
		System.out.println("s2:");
		s2.forEach(s->System.out.println(s));
		
		
		//creating a stream using stream builder
		Stream<Object> b1=Stream.builder().add("akhila").add("koti").add("varshi").build();
		System.out.println("By using builder method:");
		b1.forEach(b->System.out.println(b));
	
		
		//creating a stream using intStream
		IntStream integers=IntStream.range(1,10);
		System.out.println("By using integer Streams:");
		integers.forEach(b->System.out.println(b));
		IntStream integer=IntStream.rangeClosed(20, 30);
		integer.forEach(b->System.out.println(b));
		
	}	
}
