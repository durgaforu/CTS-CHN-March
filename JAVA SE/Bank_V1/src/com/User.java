package com;

public class User {
	
	public static void main(String[] args) {
		
		
		Bank b=new Sbi();
		b.deposit(100);
		b.withDraw();
		b=new Hdfc();
		b.deposit(99);
		b.withDraw();
		
		
	}

}
