package com.comparator;

public class Student implements Comparable<Student> {
	String  studentName;
	int studentId;
	
	Student(String sname,int sid){
		this.studentName=sname;
		this.studentId=sid;
	}
	@Override
	public String toString() {
		return "StudentDetails [studentName=" + studentName + ", studentId=" + studentId + "]";
	}
	
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentId(int studentId) {
		this.studentId=studentId;
	}
	public int getStudentId() {
		return studentId;
	}
	@Override
	public int compareTo(Student list) {
		// TODO Auto-generated method stub
		if(this.getStudentName().length() >list.getStudentName().length())
			return 1;
		else
			return -1;
	}
	
	
}
