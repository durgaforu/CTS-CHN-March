package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] args){
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a No: ");
		int n=sc.nextInt();
		System.out.println("Enter  Text: ");
		String x=sc.nextLine();
	
		
		System.out.println("No is "+n);
		
		
		sc.close();
		
	}

}
