package com;

class C1 {

	int age = 20;
	String name;

	 void f1() {
		System.out.println("-- C1 class f1 method");
	}

	void f3(int x) {
		System.out.println("C1 class f3 method number " + x);
	}

}

public class C2 extends C1 { // is 'A'

	@Override
	  void f1() {

		System.out.println("-- C2 class f1 method");

	}

	void f2() {
		System.out.println("-- C2 class f2 method");
	}

	public static void main(String[] args) {

		C2 c2 = new C2();
		c2.f1();

	}

}
