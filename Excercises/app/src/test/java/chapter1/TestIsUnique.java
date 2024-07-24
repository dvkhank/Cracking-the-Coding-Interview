package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIsUnique {
    @Test
    public void testFalse() {
        String n = "abcxyza";
        boolean expected = false;
        boolean actual = IsUnique.isUnique(n);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTrue() {
        String n = "acvbnm";
        boolean expected = true;
        boolean actual = IsUnique.isUnique(n);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFalse2() {
        String n = "";
        boolean expected = false;
        boolean actual = IsUnique.isUnique(n);

        Assertions.assertEquals(expected, actual);
    }
}
