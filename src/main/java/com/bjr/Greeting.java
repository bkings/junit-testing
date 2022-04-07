package com.bjr;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-06 07:29
 */

public class Greeting {
    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld() {
        return HELLO + " " + WORLD;
    }

    public String helloWorld(String name) {
        return HELLO + " " + name;
    }
}
