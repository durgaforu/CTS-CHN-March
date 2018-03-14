package com;

public class Test {

	/*
	 * Arguments or parameters
	 * Two types
	 * 	-> actuval arguments
	 * 	-> formal arguments
	 * 
	 * Types of methods
	 * 	-> method declaration / calling method     abc() ; // declaration
	 *  -> method defination / called method    void abc() { } // defination / called
	 *  
	 *  Note: for every method declaration, there must be method defination
	 *        for every method defination, there is no need of method declaration
	 * 
	 * 
	 */
	
	void calc(int x) { // x is known as formal argument / dummy / copied variable
		System.out.println("Suare of "+x+" is "+(x*x));
	}
	
	void calc(int x,int y) {
		System.out.println("-- Sum of "+x+" and "+y+" is "+(x+y));
	}
	
	float calc(float y) {
		return y*y;
	}
	
	 public static void main(String[] args) {
				 
		 Test t=new Test();
		 t.calc(5);  // 100 is known as actuval argument
		 t.calc(100, 200);
		 t.calc(10);
		 
		 
	}
	
}
