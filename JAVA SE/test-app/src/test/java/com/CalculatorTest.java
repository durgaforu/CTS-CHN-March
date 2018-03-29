package com;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator calc;
	
	@Before
	public void setup() {
		calc=new Calculator();
	}
	
	@Test
	public void testCalculator() {
		int actual=calc.calc(12, 12);
		assertEquals(24, actual);
	}

}
