package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPermutation {
    @Test
    public void testTrue() {
        String n1 = "abc";
        String n2 = "bac";
        boolean exptected = true;
        boolean actual = CheckPermutation.checkPermutation(n1,n2);
        Assertions.assertEquals(exptected,actual);
    }

    @Test
    public void testFalse() {
        String n1 = "abz";
        String n2 = "bac";
        boolean exptected = false;
        boolean actual = CheckPermutation.checkPermutation(n1,n2);
        Assertions.assertEquals(exptected,actual);
    }
}
