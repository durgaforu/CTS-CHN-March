package com;

public class Test {
	
	void f1(byte x) {
		System.out.println("Byte X: " + x);
	}

	void f1(int x) {
		System.out.println("int X: " + x);
	}

	void f1(long x) {
		System.out.println("Long X: " + x);
	}

	void f1(short x) {
		System.out.println("Short X: " + x);
	}
	
	void f1(float x) {
		System.out.println("FLoat X: "+x);
	}
	void f1(double x) {
		System.out.println("Double x: "+x);
	}
	
	void f1(char x) {
		System.out.println("Char: "+x);
	}
	void f1(String x) {
		System.out.println("String X: "+x);
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.f1(76.45);
		

	}

}
