package com.sets;
import java.util.LinkedHashSet;
public class AboutLinkedHashsetCases {
	public static void main(String[] args) {
		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		// Adding element to LinkedHashSet
		linkedset.add("Maruti");
		linkedset.add("BMW");
		linkedset.add("Honda");
		linkedset.add("Audi");
		linkedset.add("Maruti"); //This will not add new element as Maruti already exists
		linkedset.add("WalksWagon");
		System.out.println("Size of LinkedHashSet=" + linkedset.size());
	}
}
