package com.github.rshindo.junit5sample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

			@TestInstance(Lifecycle.PER_CLASS)
class EmployeeServiceTestSub {

	static {
		System.out.println("static initialized");
	}

	{
		System.out.println("instance created");
	}

    @BeforeAll
    static void initAll() {
        System.out.println("initAll");
    }

    @BeforeEach
    void init() {
        System.out.println("init each");
    }

    @Test
    void succeedingTest() {
    		NumberFormatException ex =
    				assertThrows(NumberFormatException.class,
    						() -> Long.valueOf(null));
    		assertEquals(ex.getMessage(), "null");
    }

    @Test
    @DisplayName("失敗するテスト")
    void failingTest() {
        fail("a failing test");
    }

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
        System.out.println("tear down each");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("tear down all");
    }

}