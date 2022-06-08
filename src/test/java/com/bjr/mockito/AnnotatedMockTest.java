package com.bjr.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-06-08 23:06
 */

public class AnnotatedMockTest {
    @Mock
    private Map<String, String> mapMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testMock() {
        mapMock.put("key", "value");
        System.out.println("map mock " + mapMock.toString());
        System.out.println("key " + mapMock.get("key"));
        assertEquals("value", mapMock.get("key"));
    }
}
