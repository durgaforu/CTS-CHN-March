package com.cts.emp.dao;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import com.cts.emp.dao.utils.DBUtils;
import com.cts.emp.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean saveRecord(Employee emp) {
		List<Employee> emps = DBUtils.getList();
		return emps.add(emp);
	}

	@Override
	public Employee findEmployee(int empId) {

		List<Employee> emps = DBUtils.getList();
		Iterator<Employee> it = emps.iterator();
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				return emp;
			}
		}

		return null;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		List<Employee> emps = DBUtils.getList();

		Iterator<Employee> it = emps.iterator();
		boolean status = false;
		while (it.hasNext()) {

			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				it.remove();
				status = true;
			}
		}

		return status;
	}

	@Override
	public boolean updateEmployee(int empId,Employee newEmp) {
		
		boolean status=false;
		List<Employee> emps = DBUtils.getList();
		
		Employee emp=findEmployee(empId);
		if(emp!=null) {
			
			ListIterator<Employee> li=emps.listIterator();
			
			while(li.hasNext()) {
				Employee e=li.next();
				if(emp.getEmpId()==e.getEmpId()) {
					li.set(newEmp);
					status=true;
					break;
				}
			}
		
		}else {
			System.out.println("Employee id "+empId+" Doesn not exits");
		}
		
		
		return status;
	}

	@Override
	public List<Employee> listAll() {

		return DBUtils.getList();
	}

}
