package com;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterOutputDemo {

	public static void main(String[] args) {

		File fileLoc = new File("d:/abc/test.txt");
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileLoc);
			for(int i=0;i<fileLoc.length();i++) {
				System.out.print((char)fr.read());
			}
		

		} catch (Exception e) {
			System.out.println("--- Faied due to " + e);
		} finally {

			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
