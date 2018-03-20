package com;

import java.io.FileOutputStream;

public class ByteDemo {

	public static void main(String[] args) {
		
		
		try {
			
			FileOutputStream fos=new FileOutputStream("d:/abc/hello.txt",true);
			
			String msg="This is another text";
			// convert string / character into bytes
			// write that converted bytes to stream
			
			byte data[]=msg.getBytes();
			
			fos.write(data);
			
			System.out.println("-- Done --");
			
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
		
		

	}

}
