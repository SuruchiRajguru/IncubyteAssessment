package com.incubyte.assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testInputString() {
		Calculator calculator=new Calculator();
		
		//assertEquals(1,Calculator.add("1"));
	//	assertEquals(3,Calculator.add("1,2"));
		//fail("Not yet implemented");
	}
	
	@Test
	public void testIsStringEmpty()
	{
		assertEquals(0,Calculator.add(""));
	}
	
	@Test
	public void testAddToHandleMultipleNumbers()
	{
		//assertEquals(5,Calculator.add("1,2,2"));
	}
	
	@Test
	public void testAddToHandleNewLinesBetweenNumbers()
	{
		//assertEquals(6,Calculator.add("1,2,3"));
	}
	
	@Test
	public void testDelimeters()
	{
		
	}
	
	@Test
	public void testNegativeNotAllowed()
	{
		try {
			Calculator.add("-1,2,3");
		}
		catch(RuntimeException e)
		{
			assertEquals(-1,"Negative number not allowed");
		}
	
	}

}
