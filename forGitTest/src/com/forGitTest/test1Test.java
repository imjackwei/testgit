package com.forGitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1Test {

	@Test
	public void testMain() {
		test1 test = new test1();
		assertEquals(10, test.add(5, 6));
	}

}
