package com;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;

public class BufferDemo {
	
	public static void main(String[] args) {
		
		try {
			
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("Enter a no: ");
			int x=Integer.parseInt(br.readLine());
			System.out.println("No is "+x);
			
			System.out.println("Enter a Text: ");
			String s1=br.readLine();
			System.out.println("Text: "+s1);
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
		
	}

}
