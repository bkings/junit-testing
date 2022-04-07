package com.bjr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-07 07:45
 */

class GreetingTest {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        Greeting greeting = new Greeting();
        assertEquals("Hello Jackson", greeting.helloWorld("Jackson"));
    }
}