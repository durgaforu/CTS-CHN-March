package com;

class Emp{
	
}
public class HashCodeDemo {
	
	public static void main(String[] args) {
	
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		Emp e4=e1;
		System.out.println(e2.getClass());
		
		System.out.println(e1.hashCode());
		System.out.println(System.identityHashCode(e1));
		
		/*System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());*/
		/*String s1="ABC";
		String s2="ABC";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());*/
		
	}

}
