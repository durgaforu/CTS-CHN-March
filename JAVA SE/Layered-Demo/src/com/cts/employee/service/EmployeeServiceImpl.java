package com.cts.employee.service;

import java.util.List;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.dao.EmployeeDaoImpl;
import com.cts.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao empDao=new EmployeeDaoImpl();

	@Override
	public boolean saveEmployee(Employee emp) {
		
		return empDao.saveEmployee(emp);
	}

	@Override
	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> listEmployees() {
		// TODO Auto-generated method stub
		return empDao.listEmployees();
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee newObj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
