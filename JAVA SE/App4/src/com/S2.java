package com;

class S1 {

	S1() {
		System.out.println("-- Super class S1 default  constructor");
	}

	S1(int x) {
		System.out.println("-- Super class S1 parametarized  constructor " + x);
	}

}

public class S2 extends S1 {

	S2() {
		//super(200);

		System.out.println("-- Sub class S2 default constructor");
	}

	S2(int x) {
		//super(100);
		System.out.println("-- Sub  class S1 parametarized  constructor " + x);
	}

	public static void main(String[] args) {

		S2 s2 = new S2(100);

	}

}
