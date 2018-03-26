package com.cts.emp.model;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int empId;
	private String empName;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}



	public static void display(List<Employee> emps) {
		System.out.println("EmpId\tEmpName\tSalary");
		System.out.println("----------------------------");
		for(Employee emp:emps) {
			System.out.print(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getSalary());
			System.out.println();
		}
		System.out.println("----------------------------");
		
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

}
