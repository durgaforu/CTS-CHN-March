package com;

public class Use {

	public static void main(String[] args) {
		
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.empId=10;
		emp1.empName="Praveen";
		emp1.salary=94734.444;
		
		emp2.empId=11;
		emp2.empName="Ozvitha";
		emp2.salary=483947;
		
		
		Display.displayEmp(emp1);
		
		Display.displayEmp(emp2);
		
		
		

	}

}
