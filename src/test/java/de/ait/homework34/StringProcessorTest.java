package de.ait.homework34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringProcessorTest {

    @Test
    public void testConcatenate() {
        StringProcessor processor = new StringProcessor();
        String result = processor.concatenate("Hi ", "Mykola");
        assertEquals("Hi Mykola", result);

    }

    @Test
    public void testGetLength() {
        StringProcessor processor = new StringProcessor();
        int length = processor.getLength("Bremen ");
        assertEquals(7, length);
    }

    @Test
    public void testReverse() {
        StringProcessor processor = new StringProcessor();
        String reversed = processor.reverse("Unit ");
        assertEquals(" tinU", reversed);
    }

    @Test
    public void testIsPalindrome() {
        StringProcessor processor = new StringProcessor();
        assertTrue(processor.isPalindrome("racecar"));
        assertFalse(processor.isPalindrome("hello"));

    }
}
