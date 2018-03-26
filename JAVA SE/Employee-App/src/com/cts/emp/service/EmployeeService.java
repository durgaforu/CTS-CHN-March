package com.cts.emp.service;

import java.util.List;

import com.cts.emp.model.Employee;

public interface EmployeeService {

	public boolean saveRecord(Employee emp);

	public Employee findEmployee(int empId);

	public boolean deleteEmployee(int empId);

	public boolean updateEmployee(int empId,Employee newEmp);

	public List<Employee> listAll();

	void backUpRecords();
	List<Employee> restoreRecords();
}
