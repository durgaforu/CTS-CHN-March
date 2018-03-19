package com;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {

		//try {
			int x = -10;
			if (x < 0) {
				throw new MyException();
			} else {
				System.out.println("X: " + x);
			}

	//	} catch (Exception e) {
			//System.out.println("X value should not be negative "+e);
		//}

	}
}
