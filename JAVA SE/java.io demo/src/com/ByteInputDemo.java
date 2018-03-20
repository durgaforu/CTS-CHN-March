package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteInputDemo {

	public static void main(String[] args) {
		
		
		try {
			
			File fileLoc=new File("d:/abc/hello.txt");
	
			if(!fileLoc.exists()) {
				throw new FileNotFoundException();
			}
			
			FileInputStream fis=new FileInputStream(fileLoc);
			
			//long len=fileLoc.length();
		
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fis.read());
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("-- Failed due to "+e);
		}
		
		
		

	}

}
