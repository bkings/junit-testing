package com.bjr.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-13 07:48
 */

class OwnerTest {

    @DisplayName("Here we look at Dependent Assertions")
    @Test
    void dependentAssertions() {
        Owner owner = new Owner("Samantha", "Kumari");
        owner.setAddress("NY");
        owner.setNumber("2345");

        assertAll("Test all properties",
                () -> assertAll("Test person properties",
                        () -> assertEquals("Samantha", owner.getFirstName(), "First name mismatch"),
                        () -> assertEquals("Kumari", owner.getLastName(), "First name mismatch")),
                () -> assertAll("Test owner properties",
                        () -> assertEquals("NY", owner.getAddress(), "Address Mismatch"),
                        () -> assertEquals("2345", owner.getNumber(), "Number not matched"))
        );
    }
}