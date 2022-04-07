package com.bjr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-07 07:45
 */

class GreetingTest {

    Greeting greeting;

    @BeforeEach
    void setUp() {
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        assertEquals("Hello Jackson", greeting.helloWorld("Jackson"));
    }
}