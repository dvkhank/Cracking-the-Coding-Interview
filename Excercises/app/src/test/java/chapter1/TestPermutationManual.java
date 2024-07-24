package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPermutationManual {
    @Test
    public void testTrue() {
        String n1 = "abc";
        String n2 = "cba";
        boolean expected = true;
        boolean actual = CheckPermutationManual.checkPermutation(n1,n2);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testFalse() {
        String n1 = "abc";
        String n2 = "abz";
        boolean expected = false;
        boolean actual = CheckPermutationManual.checkPermutation(n1,n2);
        Assertions.assertEquals(expected,actual);
    }
}
