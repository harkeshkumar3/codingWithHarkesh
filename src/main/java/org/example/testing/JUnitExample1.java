//package org.example.testing;
//
//import org.junit.jupiter.api.*;
//// Junit 5
//
///*
//  - @BeforeAll
//  - @AfterAll
//  - @BeforeEach
//  - @AfterEach
//  - @TestInstance(TestInstance.lifecycle.Per.Class
//  - @DisplayName
//  - @Disable
//* */
//
//public class JUnitExample1 {
//
//    String value = "Hello Java";
//    String value1 = "Hello Angular";
//
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("Before all ----------------- running");
//    }
//
//    @BeforeEach
//    void beforeEach() {
//        System.out.println("Before Each -------------- Running");
//    }
//
//    @AfterEach
//    void AfterEach() {
//        System.out.println("After Each ---------------running");
//    }
//
//    @Test
//    @DisplayName("Hello Java Test Case")
//    @Disabled
//    public void case1() {
//        Assertions.assertEquals("Hello Java", value);
//    }
//
//    @Test
//    public void case2() {
//        Assertions.assertEquals("Hello Angular", value1);
//    }
//
//    @AfterAll
//    static void afterAll() {
//        System.out.println("After All ----------- Running");
//    }
//}
