package com.sets;

public class Student implements Comparable{
	int studentId;
	String studentName;
	String studentGmail;
	public Student(int sid,String sname, String mail){
	this.studentId=sid;
		this.studentName=sname;
		this.studentGmail=mail;
		
	}
	@Override
	public String toString() {
		return studentId  + "\t"+studentName +"\t"+studentGmail+"\n";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGmail() {
		return studentGmail;
	}
	public void setStudentGmail(String studentGmail) {
		this.studentGmail = studentGmail;
	}
	
	public int compareTo(Object obj) {
		Student s=(Student)obj;
		if(this.getStudentId()>s.getStudentId()) 
			return +1;
		else if(this.getStudentId()<s.getStudentId()) 
			return -1;
		
		else 
			return 0;
		
		
	}
}

