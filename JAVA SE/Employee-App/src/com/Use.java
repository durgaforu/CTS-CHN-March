package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.cts.emp.dao.utils.DBUtils;
import com.cts.emp.model.Employee;

public class Use {

	public static void main(String[] args) {
		
			try {
				
				FileInputStream fis=new FileInputStream("src/emp.ser");
				ObjectInputStream ois=new ObjectInputStream(fis);
				List<Employee> oldEmps=(List<Employee>)ois.readObject();
				
				List<Employee> emps=DBUtils.getList();
				
				
				//oldEmps.
				
				
				//System.out.println("Old Size: "+oldEmps);
				//emps.clear();
				//emps.addAll(oldEmps);
				System.out.println(emps.size()+" records restored");
				
				
				
			} catch (Exception e) {
				System.out.println("Failed due to "+e);
			}
			
			
		

	}

}
