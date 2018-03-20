package com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterInputDemo {

	public static void main(String[] args) {

		File fileLoc = new File("d:/abc/test.txt");
		FileWriter fw = null;
		try {
			fw = new FileWriter(fileLoc,true);

			String msg = "I DOnt Think So..";

			fw.write(msg);
			System.out.println("-- Done --");

		} catch (Exception e) {
			System.out.println("--- Faied due to " + e);
		} finally {

			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
