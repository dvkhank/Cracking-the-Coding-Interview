package chapter1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestPalindromePermutation {
    @ParameterizedTest
    @ValueSource(strings = {"madam", "racecar", "aibohphobia", "Tact Coa"})
    public  void testTrue(String n) {
        Assertions.assertTrue(PalindromePermutation.doPalindromePermutation(n));
    }

}
