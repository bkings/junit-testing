package com.bjr.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-12 07:48
 */

class IndexControllerTest {

    private IndexController view;

    @BeforeEach
    void setUp() {
        view = new IndexController();
    }

    @Test
    void home() {
        assertEquals("home", view.home(), "Other view returned");
    }

    /**
     * Failure message is lazily loaded here. Not picked up at runtime at all until failure condition
     */
    @Test
    void dashboard() {
        assertTrue("dashboard".equals(view.dashboard()), () -> "Message from a expensive method which is evaluated only in a failure condition");
    }
}