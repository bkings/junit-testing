package com.bjr.interfaces;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

/*
 * @author bkings
 * @version 1.0.0
 * @since 2022-05-03 07:45
 */

/*
 * Added this as before all doesnt run without static declaration and since we've used default, static is not possible
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
/*
  Used this in editConfigurations to only run classes tagged with 'testInterface'
 */
@Tag("testInterface")
public interface TestInterface {

    @BeforeAll
    default void beforeAll() {
        System.out.println("Doing something before any test runs");
    }
}
