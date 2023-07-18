package com.java_algos.app;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for App.
 */
public class AppTest {
    /**
     * Test case for capitalize method.
     */
    @Test
    public void testCapitalize() {
        assertEquals("Hi There, How Is It Going?", App.capitalize("hi there, how is it going?"), "Test 1 failed");

        assertEquals("I Love Breakfast At Bill Miller Bbq", App.capitalize("i love breakfast at bill miller bbq"), "Test 2 failed");
    }
}
