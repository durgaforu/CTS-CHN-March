package com.cts.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cts.Calculator;

public class TestCalculator {

	private Calculator calc;
	
	@Before
	public void getObject() {
		
		calc=new Calculator();
		
		
		int x=10;
		
		if(x<0) {
			
		}else {
			
		}
		
	}
	
	@Test
	public void testMethod() {
		
		int actucal=calc.add(100, 100);
		
		assertEquals(200, actucal);
		
		
	}
	
	
	
	
	
	
	
	
}
