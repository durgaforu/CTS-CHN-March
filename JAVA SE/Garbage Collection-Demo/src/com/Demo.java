package com;

class Employee{
	static int count=1;
	/*
	@Override
	protected void finalize() throws Throwable {
		System.out.println("--- Object is garbage collected "+count++);
	}*/
	
	
}


public class Demo {

	public static void main(String[] args) {
		
		
		Runtime rt=Runtime.getRuntime();
		System.out.println("Total: "+rt.totalMemory());
		System.out.println("Before Loop: Free memory: "+rt.freeMemory());
		
		for(long i=1;i<=23224;i++) {
		  Employee e1=new Employee();
		}
		
		System.out.println("After Loop: Free memory: "+rt.freeMemory());
		//e1=null; // deallocation of memory for e1
		//System.gc(); // invoke garbage collector for sure
		
		System.out.println("--- Done ");
		
		
	}
	
}
