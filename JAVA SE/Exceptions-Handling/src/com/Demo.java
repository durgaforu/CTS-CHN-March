package com;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		boolean status = true;
		while (status == true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a No: ");
				int n = sc.nextInt();
				System.out.println("Number: " + n);
				status=false;
			} catch (Exception e) {
				System.out.println("Invalid input. Try again: ");
			}
		} // end of while loop
		System.out.println("-- Last line ");

	}
}