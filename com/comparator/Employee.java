package com.comparator;

public class Employee {
	int empSalary;
	String empName;
	
	Employee(int sal,String name){
		this.empName=name;
		this.empSalary=sal;
	}
	@Override
	public String toString() {
		return "Employee [empSalary=" + empSalary + ", empName=" + empName + "]";
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
