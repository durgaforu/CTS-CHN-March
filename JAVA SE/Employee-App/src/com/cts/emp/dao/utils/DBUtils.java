package com.cts.emp.dao.utils;

import java.util.ArrayList;
import java.util.List;

import com.cts.emp.model.Employee;

public class DBUtils {
	
	private static List<Employee> emps=null;
	
	public static List<Employee> getList(){
		
		if(emps==null) {
			emps=new ArrayList<>();
			emps.add(new Employee(1,"Abc",1122));
			emps.add(new Employee(2,"Xyz",545));
			emps.add(new Employee(3,"Test",3435));
			emps.add(new Employee(4,"Hoo",6564));
			emps.add(new Employee(5,"JHH",3555));
		}
		return emps;
	}
	
	

}
