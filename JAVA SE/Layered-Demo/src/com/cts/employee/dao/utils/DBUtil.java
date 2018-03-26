package com.cts.employee.dao.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

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
		
		String primaryKey="";
		
		Calendar cl=Calendar.getInstance();
		int year=cl.get(Calendar.YEAR);
		int month=cl.get(Calendar.MONTH)+1;
		int day=cl.get(Calendar.DATE);
		int hour=cl.get(Calendar.HOUR);
		int minute=cl.get(Calendar.MINUTE);
		int second=cl.get(Calendar.SECOND);
		int msecond=cl.get(Calendar.MILLISECOND);
		
		long dd=System.currentTimeMillis();
		long ll=System.nanoTime();
		
		System.out.println("Millies: "+dd);
		System.out.println("NANO: "+ll);
		System.out.println(new Date(dd));
		SimpleDateFormat sf=new SimpleDateFormat("dd/MMM/yyy hh:mm:ss:SSSSSS");
		System.out.println(sf.format(new Date(dd)));
		
		LocalDateTime ddd=LocalDateTime.now();
		System.out.println(ddd);
		
		return "";
	}

}
