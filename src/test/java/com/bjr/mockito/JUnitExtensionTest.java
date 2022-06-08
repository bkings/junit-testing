package com.bjr.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-06-08 23:30
 */
@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {
    @Mock
    private Map<String, String> mapMock;

    @Test
    void mockTest() {
        mapMock.put("key", "value");
    }
}
