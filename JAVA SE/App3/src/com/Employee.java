package com;
// POJO class 
public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	

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
		// Authencations
		// Calculations
		salary=salary*2.54;
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public static void display(Employee emp) {
		System.out.println("EMployee Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("---------------------------------------");
		
	}
	
	
	
	
	
	
	
	
	
	

}
