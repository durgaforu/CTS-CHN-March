package com;

public class WraperDemo {
	
	public static void main(String[] args) {
		
		int x=765; // wrap convert into integer class object
		Integer i=x;  // Autometic casting/ implecit casting
		System.out.println(i);
		System.out.println(Integer.toBinaryString(x));
		
		Integer ii=1000;
		int xx=ii;
		
		String s1="100";
		String s2="200";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		System.out.println(Float.parseFloat(s1)+Float.parseFloat(s2));
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
			
		Float ff=87.45f;
		int iii=ff.intValue();
		ff.doubleValue();
		ff.byteValue();
		ff.shortValue();
		ff.longValue();
		System.out.println(iii);
		
		
		ii.floatValue();
		ii.doubleValue();
		ii.shortValue();
		
		
		
		
		
		
		
		
		
		
		
	}

}
