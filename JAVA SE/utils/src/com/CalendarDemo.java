package com;

import java.util.Calendar;

public class CalendarDemo {
	
	public static void main(String[] args) {
		
		Calendar cl=Calendar.getInstance();
		
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.MONTH)+1);
		System.out.println(cl.get(Calendar.DATE));
		
		System.out.println("date: "+cl.getTime());
		System.out.println(cl.get(Calendar.DAY_OF_YEAR));
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
	}

}
