package com;

public class Test implements Runnable{
	

	@Override
	public void run() { // Run method invoked by a thread. You are not
		f1();
		
		//f2();
	}
	
	
	void f1() {
		String tname=Thread.currentThread().getName();
		if(tname.equals("First Thread")) {
			System.out.println(tname+" is sleeping");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(tname+" Resumed from Sleep");
		}
		for(int i=1;i<=5;i++)
			System.out.println("I = "+i+" By "+tname);
	}
	
	void f2() {
		String tname=Thread.currentThread().getName();
		for(int j=1;j<=5;j++) 
			System.out.println("J= "+j+" By "+tname);
	}

	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread().getName()); // name, group and priority
		
		/*Test t=new Test();
		t.f1();
		t.f2();*/
		
		
		Test t=new Test();
		
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		
		// Thred proirity
		// 3 Priorities -> min=1, max=10, norm=5
		
		t1.setName("First Thread");
		t2.setName("Second Thread");
		
	   // t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start(); // start method of thred internally calls run method of assigned class object type
		t2.start();
		
		
		
		
		
		
		

	}


}
