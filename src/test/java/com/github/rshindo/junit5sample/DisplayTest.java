package com.github.rshindo.junit5sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayTest {
	@Test
	@DisplayName("1 + 1 = 2になるテスト")
	void plusTest() {
		assertEquals(1 + 1, 2);
	}

	@Test
	@DisplayName("😁") // 絵文字も可能
	void emojiTest() {
	}
}
