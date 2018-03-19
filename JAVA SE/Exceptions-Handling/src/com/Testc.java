package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Testc {

	public static void main(String[] args) {

		try {
			// write BL here
			int x[] = new int[1];
			Class.forName("com.Employee");
			FileInputStream fis = new FileInputStream("D:/blabla.txt");
			x[0] = 100;

			System.out.println("--- EMployee class got loded");

		}catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("--- This is Another Statement");

	}

}
