package com.bjr.models;

import com.bjr.enums.OwnerType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

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

    @DisplayName("Value Source Test")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ValueSource(strings = {"Test", "with", "parameters"})
    void testValueSource(String value) {
        System.out.println(value);
    }

    @DisplayName("Enum Source")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @EnumSource(value = OwnerType.class)
    void enumTest(OwnerType ownerType) {
        System.out.println(ownerType);
    }

    @DisplayName("From Method source")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @MethodSource("argsProvider")
    void methodSourceArgs(String prefix, String mid, int num) {
        System.out.println("Prefix " + prefix + " all - " + mid + ":" + num);
    }

    static Stream<Arguments> argsProvider() {
        return Stream.of(
                Arguments.of("sth", "fishy", 1),
                Arguments.of("nth", "here", 4),
                Arguments.of("ok", "then", 5));
    }
}