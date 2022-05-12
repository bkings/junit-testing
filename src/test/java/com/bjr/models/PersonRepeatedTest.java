package com.bjr.models;

import com.bjr.interfaces.RepeatedTestInterface;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-05-12 07:33
 */

public class PersonRepeatedTest implements RepeatedTestInterface {
    @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} of {totalRepetitions}")
    @DisplayName("Repeated Test")
    void repeatedTest() {
        assertThat(10).isEqualTo(10);
    }

    @RepeatedTest(5)
    void dIRepeated(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println(testInfo.getDisplayName() + " " + repetitionInfo.getCurrentRepetition());
    }

    @RepeatedTest(value = 3, name = "{displayName}: {currentRepetition} of {totalRepetitions}")
    @DisplayName("Person Test")
    public void PersonTest() {
        System.out.println("Testing");
    }
}
