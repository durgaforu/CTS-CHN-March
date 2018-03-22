package com;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>,Comparator<Employee>{
	private int empId;
	private String empName;
	private double salary;
	
	@Override
	public int compareTo(Employee emp) {
		
		return empId-emp.getEmpId();
	}
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.getEmpName().compareTo(emp2.getEmpName());
	}
	
	
	
	
	
	
	
	
	

	private Department dept; // Forward Declaration
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void display(List<Employee> emps) {
		System.out.println("EmpId\tEmpName\tSalary");
		System.out.println("------------------------------------");
		for (Employee emp : emps) {
			System.out.print(emp.getEmpId() + "\t" + emp.getEmpName() + "\t" + emp.getSalary());
			System.out.println();
		}
		System.out.println("-------------------------------");
	}

}
