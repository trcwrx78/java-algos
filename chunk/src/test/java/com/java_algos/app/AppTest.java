package com.java_algos.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Test Case for chunk method
     */
    @Test
    public void testChunk1() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] chunked = App.chunk(arr, 2);

        int[][] expected = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        // Two dimensional arrays are not equal by default
        // compare using loop
        for(int i=0; i < expected.length; i++) {
            assertArrayEquals(expected[i], chunked[i]);
        }
    }

    @Test
    public void testChunk2() {
        int[] arr = {1, 2, 3};
        int[][] chunked = App.chunk(arr, 1);

        int[][] expected = {{1}, {2}, {3}};

        // Two dimensional arrays are not equal by default
        // compare using loop
        for(int i=0; i < expected.length; i++) {
            assertArrayEquals(expected[i], chunked[i]);
        }
    }

    @Test
    public void testChunk3() {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] chunked = App.chunk(arr, 3);

        int[][] expected = {{1, 2, 3}, {4, 5}};

        // Two dimensional arrays are not equal by default
        // compare using loop
        for(int i=0; i < expected.length; i++) {
            assertArrayEquals(expected[i], chunked[i]);
        }
    }

    @Test
    public void testChunk4() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int[][] chunked = App.chunk(arr, 5);

        int[][] expected = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, 
                            {11, 12, 13}};

        // Two dimensional arrays are not equal by default
        // compare using loop
        for(int i=0; i < expected.length; i++) {
            assertArrayEquals(expected[i], chunked[i]);
        }
    }
}
