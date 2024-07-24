package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestURLify {
    @Test
    public void testTrue() {
        String expected = "Mr%20Smith%20can%20do%20that";
        String actual =  new String(URLify.doURLify("Mr Smith can do that"));
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testFalse() {
        String expected = "Mr%20Smith%20can%20do%20that%20";
        String actual =  new String(URLify.doURLify("Mr Smith can do that"));
        Assertions.assertEquals(expected,actual);
    }
}
