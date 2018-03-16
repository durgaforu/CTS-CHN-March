package com;

public class App2 {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc");
		System.out.println("SB:  "+sb);
		System.out.println("HashCode: "+System.identityHashCode(sb));
		
		sb.append("Xyz");
		System.out.println("SB:  "+sb);
		System.out.println("HashCode: "+System.identityHashCode(sb));
		
		sb.reverse();
		
		System.out.println("SB:  "+sb);
		System.out.println("HashCode: "+System.identityHashCode(sb));
		
	}

}
