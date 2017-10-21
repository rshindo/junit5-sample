package com.github.rshindo.junit5sample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

class EmployeeServiceTest {

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