package com;

import java.util.ArrayList;
class Employee{
	
}
public class GenDemo<E> {

	ArrayList<Object> arr = new ArrayList<>();

	void add(E object) {
		arr.add(object);
	}

	void display() {
		for (Object obj : arr) {
			System.out.println(obj);
		}
	}

	void f1(E element) {
		System.out.println("Value is " + element);
	}

	public static void main(String[] args) {

		GenDemo<Employee> g = new GenDemo<>();
		/*g.add("Praveen");
		g.add("James");
		g.add('A');
		g.add(100);
		g.add(76.45f);
		g.add(4545.45);*/
		
		
		g.display();
		
		

	}

}
