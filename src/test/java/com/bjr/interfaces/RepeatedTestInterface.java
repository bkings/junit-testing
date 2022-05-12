package com.bjr.interfaces;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-05-12 07:35
 */
@Tag("repeated")
public interface RepeatedTestInterface {
    //default beforeEach - output test information
    @BeforeEach
    default void setUp(TestInfo testInfo) {
        System.out.println("Test Info " + testInfo.getDisplayName());
    }
}
