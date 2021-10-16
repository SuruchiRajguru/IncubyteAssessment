package com.incubyte.assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class InputNumberAndSum {

	
	@Test
	public void testAddToHandleMultipleNumbers()
	{
		assertEquals(1+2+2,NumberSum.add("1,2,2"));
	}
	

}
