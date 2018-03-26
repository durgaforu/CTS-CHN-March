package com.cts.emp.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import com.cts.emp.dao.EmployeeDao;
import com.cts.emp.dao.EmployeeDaoImpl;
import com.cts.emp.dao.utils.DBUtils;
import com.cts.emp.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao empDao=new EmployeeDaoImpl();
	
	
	
	public void backUpRecords() {
		
		try {
			
			List<Employee> emps=DBUtils.getList();
			
			FileOutputStream fos=new FileOutputStream("src/emp.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(emps);
			System.out.println(emps.size()+" recods backed up successfully");
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
	}
	
	


	@Override
	public boolean saveRecord(Employee emp) {
		
		return empDao.saveRecord(emp);
	}

	@Override
	public Employee findEmployee(int empId) {
		return empDao.findEmployee(empId);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		
		return empDao.deleteEmployee(empId);
	}

	@Override
	public boolean updateEmployee(int empId,Employee newEmp) {
	
		return empDao.updateEmployee(empId, newEmp);
	}

	@Override
	public List<Employee> listAll() {
		
		return empDao.listAll();
	}




	@Override
	public List<Employee> restoreRecords() {
		
		try {
			
			FileInputStream fis=new FileInputStream("src/emp.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			List<Employee> oldEmps=(List<Employee>)ois.readObject();
			
			List<Employee> emps=DBUtils.getList();
			
			
			emps.clear();
			emps.addAll(oldEmps);
			System.out.println(oldEmps.size()+" records restored");
			
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
		
		return null;
	}

	
	
	
}
