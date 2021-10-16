package com.incubyte.assessment;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewLineBetweenNumbers {

	@Test
	public void testNewLineBetweenNumbers() {
		assertEquals(6,NewLineFeed.add("1\n2,3"));
	}

}
