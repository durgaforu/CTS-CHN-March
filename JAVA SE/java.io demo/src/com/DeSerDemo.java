package com;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("d:/abc/emp.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			
			Employee e=(Employee)ois.readObject();
			
			System.out.println("Emp Id: "+e.getEmpId());
			System.out.println("Name: "+e.getEmpName());
			System.out.println("Salary: "+e.getSalary());
			System.out.println("Info: "+e.getInfo());
			
			ois.close();
			fis.close();
			
			
		} catch (Exception e) {
			System.out.println("--- Failed due to "+e);
		}

	}

}
