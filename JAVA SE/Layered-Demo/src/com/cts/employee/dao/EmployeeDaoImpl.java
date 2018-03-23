package com.cts.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.employee.dao.utils.DBUtil;
import com.cts.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection con = null;
	private Statement stmt = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public boolean saveEmployee(Employee emp) {

		con = DBUtil.getConnection();

		boolean status = false;
		try {
			String q1 = "insert into employee values(?,?,?)";
			ps = con.prepareStatement(q1);
			ps.setInt(1, emp.getEmpId());
			ps.setString(2, emp.getEmpName());
			ps.setDouble(3, emp.getSalary());

			int x = ps.executeUpdate();

			if (x != 0)
				status = true;

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

		System.out.println(emp.getEmpName() + " Saved  to DB");

		return status;
	}

	@Override
	public Employee findEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> listEmployees() {

		List<Employee> emps = new ArrayList<>();

		try {

			con = DBUtil.getConnection();
			String q1 = "select * from employee";
			stmt = con.createStatement();
			rs = stmt.executeQuery(q1);

			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setEmpName(rs.getString(2));
				emp.setSalary(rs.getDouble(3));
				emps.add(emp);

			}

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}
		return emps;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(Employee newObj) {
		// TODO Auto-generated method stub
		return false;
	}

}
