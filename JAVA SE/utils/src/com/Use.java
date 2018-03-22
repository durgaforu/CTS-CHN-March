package com;

public class Use {

	public static void main(String[] args) {
		
		Department dept=new Department();
		dept.setDeptId(1111);
		dept.setDeptName("Accounts");
		dept.setLoc("Chennai");
		
		Employee emp=new Employee();
		emp.setEmpId(10);
		emp.setEmpId(11);
		emp.setEmpName("Praveen");
		emp.setSalary(348734);
		
		emp.setDept(dept);
		
		System.out.println("EnpId: "+emp.getEmpId());
		System.out.println("Name: "+emp.getEmpName());
		System.out.println("Salary: "+emp.getSalary());
		System.out.println("Dept id: "+emp.getDept().getDeptId());
		System.out.println("Dept name: "+emp.getDept().getDeptName());
		System.out.println("Location: "+emp.getDept().getLoc());
		
		
		

	}

}
