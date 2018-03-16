package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Person {

	private int pid;
	private String personName;
	
	public Person(int pid, String personName) {
		this.pid = pid;
		this.personName = personName;
	}
	
	@Override
	public String toString() {
		return "Person Id: "+pid+" and Name: "+personName;
	}

	public static void main(String[] args) {
		
		
		/*Map<String, Object> mp=new HashMap<>();
		mp.put("s1", "Praveen");
		mp.put("s2", "Ozvitha");
		mp.put("s3", "James");
		
		Set<String> keys=mp.keySet();
		
		for(String key:keys) {
			System.out.println(mp.get(key));
		}
		System.out.println("---------------------------");*/
		
		Person p1=new Person(10, "Praveen");
		Person p2=new Person(11, "ozvitha");
	
		System.out.println(p1);
		System.out.println(p2);
		
		
	
	}

}
