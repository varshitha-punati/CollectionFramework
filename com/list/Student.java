package com.list;

public class Student {
	int studentId;
	String studentName;
	String studentGmail;
	Student(int sid,String sname, String mail){
		this.studentId=sid;
		this.studentName=sname;
		this.studentGmail=mail;
		
		}
	@Override
	public String toString() {
		return "sid:"+studentId  + "\t"+"sname:"+studentName +"\t"+"mail:"+studentGmail+"\n";
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
	
}

