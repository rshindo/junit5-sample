package com.github.rshindo.junit5sample;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class VintageTest {

	@Test
	public void test() {
		assertTrue(true);
	}

}
