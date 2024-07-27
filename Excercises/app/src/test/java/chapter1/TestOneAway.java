package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOneAway {
    @Test
    public void testInsertTrue() {
        String n1 = "pale";
        String n2 = "ple";
        boolean expected = true;
        boolean actual = OneAway.doOneWay(n1,n2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testReplaceTrue() {
        String n1 = "pale";
        String n2 = "palw";
        boolean expected = true;
        boolean actual = OneAway.doOneWay(n1,n2);
        Assertions.assertEquals(expected,actual);
    }
}
