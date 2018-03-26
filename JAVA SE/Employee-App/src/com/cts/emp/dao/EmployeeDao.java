package com.cts.emp.dao;

import java.util.List;

import com.cts.emp.model.Employee;

public interface EmployeeDao {

	public boolean saveRecord(Employee emp);

	public Employee findEmployee(int empId);

	public boolean deleteEmployee(int empId);

	public boolean updateEmployee(int empId,Employee newEmp);
	
	public List<Employee> listAll();
	
	

}
