package com.incubyte.assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class DelimitersTest {

	@Test(expected=RuntimeException.class)
	public void test() {
		assertEquals(3,Delimiters.add("//;\\n1;2"));
	}

}
