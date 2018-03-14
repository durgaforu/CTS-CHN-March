package com;

public class Use {
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpName("Ozvitha");
		emp.setSalary(947974);
		
		Employee e1=new Employee();
		e1.setEmpId(11);
		e1.setEmpName("Praveen");
		e1.setSalary(9347394);
		
		/*System.out.println("Emp Id: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());

		System.out.println("--------------------------------");
		
		
		System.out.println("Emp Id: "+e1.getEmpId());
		System.out.println("Name: "+e1.getEmpName());
		System.out.println("Salary: "+e1.getSalary());*/
		
		Employee.display(emp);
		Employee.display(e1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
