package com.bjr.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-13 07:18
 */

class PersonTest {

    @Test
    void groupedAssertions() {
        Person person = new Person("Rama", "Kumar");
        assertAll("Test in groups",
                () -> assertEquals("Rama", person.getFirstName(), "First name failed"),
                () -> assertEquals("Kumar", person.getLastName(), "Last name failed"));
    }
}