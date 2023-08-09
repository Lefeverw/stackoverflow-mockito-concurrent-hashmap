package com.wouterlefever.stackoverflow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ConcurrentHashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class UtilTest {

    private ConcurrentHashMap map;

    @BeforeEach
    void setUp() {
        map = mock(ConcurrentHashMap.class);
    }

    @Test
    void test(){
        when(map.get("key")).thenReturn("value");

        assertEquals("value", map.get("key"));
    }
}
