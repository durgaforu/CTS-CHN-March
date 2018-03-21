package com;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Object, Object> hm=new LinkedHashMap<>();
		hm.put(10, 100);
		hm.put(21, 87.45f);
		hm.put(874, "Bucky Wall");
		hm.put(5, "Ford");
		hm.put(87, 100);
		hm.put(20, "New Data");
		
		System.out.println(hm.get(874));
		hm.remove(5);
		System.out.println(hm);
		System.out.println("Size: "+hm.size());
		hm.replace(20, "Praveen S");
		System.out.println(hm);
		
		
		
		
		
		

	}

}
