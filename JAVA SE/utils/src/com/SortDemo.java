package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return (int) (emp1.getSalary()-emp2.getSalary());
	}
	
	
}

public class SortDemo {

	public static void main(String[] args) {
		
		Employee e1=new Employee(176, "Nos", 25000);
		Employee e2=new Employee(102, "Dos", 19000);
		Employee e3=new Employee(134, "Mou", 35000);
		Employee e4=new Employee(101, "Agf", 12000);
		Employee e5=new Employee(115, "Ctg", 10000);
		
		List<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		System.out.println("Before Sort. Orginal data");
		Employee.display(emps);
		
		Collections.sort(emps);
		
		System.out.println("Sorting on EMPID.");
		Employee.display(emps);
		
		System.out.println("Sorting on EMPNAME.");
		Collections.sort(emps,new Employee());
		Employee.display(emps);
		
		
		System.out.println("Sorting on SALARY.");
		Collections.sort(emps,new SortBySalary());
		Employee.display(emps);
		
		
		
		

	}

}
