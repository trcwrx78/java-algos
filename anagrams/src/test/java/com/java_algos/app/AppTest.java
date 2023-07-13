package com.java_algos.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for App.
 */
public class AppTest {
    /**
     * Test case for anagrams method
     */
    @Test
    public void testAnagrams() {
        assertTrue(App.anagrams("hello", "llohe"), "'hello' is not an anagram of 'llohe'");

        assertTrue(App.anagrams("Whoa! Hi!", "Hi! Whoa!"), "'Whoa! Hi!' is not an anagram of 'Hi! Whoa!'");

        assertFalse(App.anagrams("One One", "Two two two"), "'One One' is an anagram of 'Two two two'");

        assertFalse(App.anagrams("One one", "One one c"), "'One one' is an anagram of 'One one c'");

        assertFalse(App.anagrams("A tree, a life, a bench", "A tree, a fence, a yard"), "'A tree, a life, a bench' is an anagram of 'A tree, a fence, a yard'");
    }
}
