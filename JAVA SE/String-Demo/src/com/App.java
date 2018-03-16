package com;

public class App {

	public static void main(String[] args) {
		
		String s1="Abc";
		System.out.println("S1 Content: "+s1);
		System.out.println("HashCode of S1: "+System.identityHashCode(s1));
		
		String s2=new String("Abc");
		
		System.out.println("S2 Content: "+s2);
		System.out.println("HashCode of S2: "+System.identityHashCode(s2));
		
		
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}

		
		
		
		
		
		
		
		
		
		

	}

}
