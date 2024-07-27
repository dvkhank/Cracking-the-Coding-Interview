package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringCompression {
    @Test
    public void testTrue () {
        String n = "aabcccccaaa";
        String expected = "a3b1c5a3";
        String actual  = StringCompression.doStringCompression(n);
        Assertions.assertEquals(expected,actual);
    }
}
