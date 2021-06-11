package com.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Candidate implements Comparable<Candidate> {
	private int marks;
	private String name;
	int size;

	public Candidate(String name, int marks) {

		this.marks = marks;
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + "\t" + marks;
	}

	@Override
	public int compareTo(Candidate o) {
		// TODO Auto-generated method stub
		if (this.getMarks() < o.getMarks())
			return -1;
		else
			return 1;

	}
}

class Number {
	public static void main(String[] args) {
		ArrayList<Candidate> a = new ArrayList<Candidate>();
		a.add(new Candidate("sita", 25));
		a.add(new Candidate("Gita", 22));
		a.add(new Candidate("Rita", 24));
		Collections.sort(a);
		for (Candidate l : a) {
			System.out.println(l);
		}
	}

}
