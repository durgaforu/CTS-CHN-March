package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {
	
	public static void main(String[] args) {
		
		try {
			
			FileOutputStream fos=new FileOutputStream("d:/abc/emp.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			Employee emp=new Employee();
			
			emp.setEmpId(10);
			emp.setEmpName("Ozvitha");
			emp.setSalary(473944);
			emp.setInfo("Infomation abt employee");
			
			oos.writeObject(emp);
			
			oos.close();
			fos.close();
			
			System.out.println("-- Done --");
			
			
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
		
		
	}

}
