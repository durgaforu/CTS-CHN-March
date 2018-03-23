package com.cts.employee.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static Connection con = null;

	private DBUtil() {
	}

	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (con == null) {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			}
			return con;
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}
		return con;
	}

	public static String generatePK() {
		return "";
	}

}
