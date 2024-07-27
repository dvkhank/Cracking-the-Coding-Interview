package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringRotation {
    @Test
    public void testTrue() {
        String n1 = "waterbottle";
        String n2 = "erbottlewat";
        boolean expected = true;
        boolean actual = StringRotation.doStringRotation(n1,n2);
        Assertions.assertEquals(expected,actual);
    }

}
