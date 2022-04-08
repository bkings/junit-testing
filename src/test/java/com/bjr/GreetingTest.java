package com.bjr;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-07 07:45
 */

class GreetingTest {

    Greeting greeting;

    @BeforeAll
    static void classLevelSetup() {
        System.out.println("Establishing connections and loading properties .... ");
    }

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
        System.out.println("Greetings from before each");
    }

    @Test
    void helloWorld() {
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        assertEquals("Hello Jackson", greeting.helloWorld("Jackson"));
    }

    @AfterEach
    void cleanUp() {
        System.out.println("Exiting after each");
    }

    @AfterAll
    static void classLevelCleanUp() {
        System.out.println("Closing connections");
    }
}