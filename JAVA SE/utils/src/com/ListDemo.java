package com;
import java.util.ArrayList;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
		
		
	List<Object> arr=new ArrayList<>();
		
		arr.add("Praveen");
		arr.add('A');
		arr.add(100);
		arr.add(65.45f);
		arr.add(83434.44);
		arr.add(65.45f);
		arr.add(65.45f);
		arr.add(65.45f);
		arr.add(65.45f);
		arr.add(0, 10000);
		arr.add(65.45f);
		
		System.out.println(arr);
		System.out.println("Size: "+arr.size());
		
		System.out.println(arr.get(2));
		arr.remove(1);
		System.out.println(arr);
		System.out.println("Size: "+arr.size());
		
		arr.set(0, "Ozvitha");
		System.out.println(arr);
		System.out.println(arr.contains(83434.44)); 
		
		arr.clear();
		System.out.println(arr);
		System.out.println("Size: "+arr.size());
		
		
		

	}

}
