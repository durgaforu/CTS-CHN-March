package com;

import java.util.List;
import java.util.Scanner;
import com.cts.emp.model.Employee;
import com.cts.emp.service.EmployeeService;
import com.cts.emp.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {

		// Menu driven application

		// Create a infinate loop for menu

		EmployeeService empService = new EmployeeServiceImpl();

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		int ch;
		while (true) {

			System.out.println("MENU");
			System.out.println("1. Add");
			System.out.println("2. List Records");
			System.out.println("3. Find Record");
			System.out.println("4. Update Record");
			System.out.println("5. Delete Record");
			System.out.println("6. Delete All Records");
			System.out.println("7. Back Up Records");
			System.out.println("8. Restore Data");
			System.out.println("9. Exit");
			System.out.println("Enter Choice: ");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				Employee emp = new Employee();
				emp.setEmpId(10);
				emp.setEmpName("Praveen");
				emp.setSalary(49394);
				empService.saveRecord(emp);
				System.out.println("Employee record Saved");

				break;
			case 2:
				List<Employee> emps = empService.listAll();
				Employee.display(emps);
				break;
			case 3:
				break;
			case 4:
				emp = new Employee();
				emp.setEmpId(11);
				emp.setEmpName("James");
				emp.setSalary(4343434);
				empService.updateEmployee(10, emp);
				break;
			case 5:
				System.out.println("Enter Empid to Delete");
				int empId = sc.nextInt();
				boolean status = empService.deleteEmployee(empId);
				if (status) {
					System.out.println("Employee Deleted ");
				} else {
					System.out.println(empId + " not available in DB");
				}
				break;

			case 7:
				empService.backUpRecords();
				break;
			case 8:
				empService.restoreRecords();
				break;

			case 9:
				// flag=false;
				System.out.println("Thank You. Visit again");
				System.exit(1);
			default:
				System.out.println("Invalid Choice. try again");
			}

		} // end of while

	}

}
