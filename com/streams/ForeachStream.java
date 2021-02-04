package com.streams;
import java.util.List;
import java.util.ArrayList;
public class ForeachStream {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("varshi");
		list.add("Akhila");
		list.add("koti");
		list.add("sai");
		
		//by using for each without streams
		for(String s:list) {
			System.out.println(s);
		}
		//by using for each with streams
		list.stream().forEach(t->System.out.println(t));	
		}
}
