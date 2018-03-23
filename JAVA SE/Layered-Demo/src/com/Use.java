package com;

import java.sql.Connection;
import java.util.List;

import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.dao.utils.DBUtil;
import com.cts.employee.model.Employee;
import com.cts.employee.service.EmployeeService;
import com.cts.employee.service.EmployeeServiceImpl;

public class Use {

	public static void main(String[] args) {
	/*	Employee emp = new Employee();
		emp.setEmpId(15);
		emp.setEmpName("Kavya Sharma");
		emp.setSalary(4973947);*/

		EmployeeService empService = new EmployeeServiceImpl();
		 //empService.saveEmployee(emp);

		List<Employee> emps=empService.listEmployees();
		
		for(Employee emp:emps) {
			System.out.println("EMpId: "+emp.getEmpId());
			System.out.println("Name: "+emp.getEmpName());
			System.out.println("Salary: "+emp.getSalary());
			System.out.println("--------------------------------");
			
		}
		
		
		

	}

}
