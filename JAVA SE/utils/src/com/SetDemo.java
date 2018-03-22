package com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		Set<Object> hs=new HashSet<>();
		hs.add(100);
		hs.add(3445);
		hs.add(222);
		hs.add(100);
		hs.add(760);
		hs.add(36);
		hs.add(87);
		
		//System.out.println(hs);
		/*System.out.println("Size: "+hs.size());
		
		hs.remove("James");
		
		System.out.println(hs);
		System.out.println("Size: "+hs.size());
		
		for(Object obj:hs) {
		System.out.println(obj);
		}*/
		
		
		Iterator<Object> it=hs.iterator();
		while(it.hasNext()) {
			Object obj=it.next();
			if(obj.equals(222)) {
				hs.add(333);
				it.remove();
				continue;
			}
			System.out.println(obj);
		}
		
		
		
		
		
	}

}
