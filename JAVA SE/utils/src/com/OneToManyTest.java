package com;
public class OneToManyTest {

	public static void main(String[] args) {
		
		Employee e1=new Employee(10, "Praveen", 843384);
		Employee e2=new Employee(11, "Ozvitha", 34345);
		Employee e3=new Employee(12, "James", 4667);
		Employee e4=new Employee(13, "Bucky", 232455);
		Employee e5=new Employee(14, "Robert", 75757);
		
		Department dept=new Department();
		dept.setDeptId(1000);
		dept.setDeptName("IT");
		dept.setLoc("Bangalore");
		
		dept.getEmps().add(e1);
		dept.getEmps().add(e2);
		//dept.getEmps().add(e3);
		dept.getEmps().add(e4);
		dept.getEmps().add(e5);
		
		
		System.out.println("Dept Id: "+dept.getDeptId());
		System.out.println("Name: "+dept.getDeptName());
		System.out.println("Location: "+dept.getLoc());
		
		
		Employee.display(dept.getEmps());
		
		
		
		
		
		/*List<Employee> emps=new ArrayList<>();
		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		emps.add(e5);
		
		Employee.display(emps);
		*/
		
		

	}

}
