package de.ait.homework34;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringProcessorTest {
    private StringProcessor processor;

    @BeforeEach
    public void setUp() {
        processor = new StringProcessor();
    }

    @Test
    public void testConcatenate() {
        assertEquals("Hi Mykola",processor.concatenate("Hi ","Mykola"));
    }

    @Test
    public void testGetLength() {
        //  StringProcessor processor = new StringProcessor();
        //  int length = processor.getLength("Bremen ");
        assertEquals(7,processor.getLength("Bremen "));
    }

    @Test
    public void testReverse() {
       // StringProcessor processor = new StringProcessor();
       // String reversed = processor.reverse("Unit ");
        assertEquals(" tinU",processor.reverse("Unit "));
    }

    @Test
    public void testIsPalindrome() {
       // StringProcessor processor = new StringProcessor();
        assertTrue(processor.isPalindrome("racecar"));
        assertFalse(processor.isPalindrome("hello"));

    }
}
