package com.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorMethod {

public static void main(String args[])
{
    // Creating an empty Set
    Set<String> set = new HashSet<String>();

    // Use add() method to add elements into the Set
    set.add("Welcome");
    set.add("To");
    set.add("Geeks");
    set.add("4");
    set.add("Geeks");

    // Displaying the Set
    System.out.println("Set: " + set);

    // Creating an iterator
    Iterator<String> value = set.iterator();

    // Displaying the values after iterating through the iterator
    System.out.println("The iterator values are: ");
    while (value.hasNext()) {
        System.out.println(value.next());
    }
}
}