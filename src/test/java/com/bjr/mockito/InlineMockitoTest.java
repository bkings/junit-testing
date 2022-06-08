package com.bjr.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-06-08 21:08
 */

class InlineMockitoTest {

    @Test
    void mockitoInline() {
        Map mapMock = mock(Map.class);
        assertEquals(mapMock.size(), 0);

        List listMock = mock(List.class);
        assertEquals(listMock.size(), 0);
    }
}
