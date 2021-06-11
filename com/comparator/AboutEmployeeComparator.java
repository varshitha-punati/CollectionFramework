package com.comparator;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

//Here the class implements the comparator interface
public  class AboutEmployeeComparator  implements Comparator<Employee>{
	
	
	public static void main(String[] args) {
		
		//create an empty arrayList
		ArrayList<Employee> list=new ArrayList<Employee>();
		
		//assinging values to the Arraylist
		list.add(new Employee(1000,"punati"));
		list.add(new Employee(2000,"nadendla"));
		
		//sort the ArrayList
		Collections.sort(list, new AboutEmployeeComparator());
		
		
		//enhanced for loop
		for(Object s:list) {
			System.out.println(s);
		}

	}

	@Override
	//using compare method 
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		
		//comparing the Employee Salary
		if(e1.getEmpSalary()>e2.getEmpSalary())
		return -1;
		else
		return 1;
	}
}
class EmployeeComparator  implements Comparator<Employee>{
	
	
	public static void main(String[] args) {
		
		//create an empty arrayList
		ArrayList<Employee> list1=new ArrayList<Employee>();
		
		//assinging values to the Arraylist
		list1.add(new Employee(1000,"punati"));
		list1.add(new Employee(2000,"nadendla"));
		
		//sort the ArrayList
//		Collections.sort(list, new EmployeeComparator());
		
		
		//enhanced for loop
		for(Object s1:list1) {
			System.out.println(s1);
		}

	}

	@Override
	//using compare method 
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		
		//comparing the Employee Salary
		if(e1.getEmpSalary()<e2.getEmpSalary())
		return -1;
		else
		return 1;
	}
}
