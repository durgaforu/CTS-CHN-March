package com.cts.employee.service;

import java.util.List;

import com.cts.employee.model.Employee;

public interface EmployeeService {

	boolean saveEmployee(Employee emp);

	Employee findEmployee(int empId);

	List<Employee> listEmployees();

	boolean deleteEmployee(int empId);

	boolean updateEmployee(Employee newObj);

}
