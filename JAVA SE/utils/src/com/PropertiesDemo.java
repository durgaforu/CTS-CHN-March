package com;
import java.io.FileInputStream;
import java.util.Properties;
public class PropertiesDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("src/data.properties");
			
			Properties props=new Properties();
			props.load(fis);
			props.setProperty("empName", "Ozvitha");
			System.out.println("Name: "+props.getProperty("name"));
			System.out.println("Age: "+props.getProperty("age"));
			System.out.println("City: "+props.getProperty("city"));
			System.out.println("empName: "+props.getProperty("empName"));
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}

	}

}
