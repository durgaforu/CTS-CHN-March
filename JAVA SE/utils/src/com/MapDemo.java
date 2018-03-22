package com;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Object, Object> hm=new TreeMap<>();
		
		hm.put(10, 100);
		hm.put(20, 87.45f);
		hm.put(874, "Bucky Wall");
		hm.put(5, "Ford");
		hm.put(87, 100);
		hm.put(20, "New Data");
		hm.put(233, "dkhdhd");
		
		/*System.out.println(hm.get(874));
		hm.remove(5);
		System.out.println(hm);
		System.out.println("Size: "+hm.size());
		hm.replace(20, "Praveen S");*/
		//System.out.println(hm);
		
		// Copy all map keys into set interface
		
	/*	Set<Object> keys=hm.keySet();
		
		//System.out.println(keys);
		
		Iterator<Object> it=keys.iterator();
		
		while(it.hasNext()) {
			Object key=it.next();
			System.out.println(hm.get(key));
		}*/
		
		
		// Copy map key and values into set interface
		
		Set<Map.Entry<Object, Object>> mapData= hm.entrySet();
		System.out.println(mapData);
		
		
		

	}

}
