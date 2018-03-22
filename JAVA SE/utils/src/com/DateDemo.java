package com;

import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		System.out.println("year: "+(d.getYear()+1900));
		System.out.println("Month: "+(d.getMonth()+1));
		System.out.println("Date: "+d.getDate());
		System.out.println("Hour: "+d.getHours());
		System.out.println("Mins: "+d.getMinutes());
		System.out.println("Seconds: "+d.getSeconds());
		
		
		
		
	}

}
