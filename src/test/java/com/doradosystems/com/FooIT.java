package com.doradosystems.com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FooIT {

	@Test
	public void fooTest(){
		assertEquals("foo".length(), 3);
	}
}
