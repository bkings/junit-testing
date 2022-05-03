package com.bjr.controller;

import com.bjr.exceptions.DataNotFoundException;
import com.bjr.interfaces.TestInterface;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-12 07:48
 */

class IndexControllerTest implements TestInterface {

    private IndexController view;

    @BeforeEach
    void setUp() {
        view = new IndexController();
    }

    @Test
    void home() {
        assertEquals("home", view.home(), "Other view returned");
        // from assertJ library
        assertThat(view.home()).isEqualTo("home");
    }

    /**
     * Failure message is lazily loaded here. Not picked up at runtime at all until failure condition
     */
    @Test
    void dashboard() {
        assertTrue("dashboard".equals(view.dashboard()), () -> "Message from a expensive method which is evaluated only in a failure condition");
    }

    @Test
    @DisplayName("Test for exception")
    void exceptionTest() {
        assertThrows(DataNotFoundException.class, () -> {
           view.handler();
        });
    }
}