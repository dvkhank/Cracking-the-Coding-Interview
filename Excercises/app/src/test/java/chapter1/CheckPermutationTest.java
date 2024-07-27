package chapter1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Objects;
import java.util.stream.Stream;

import static chapter1.CheckPermutation.checkPermutationV1;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckPermutationTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
                // trivial cases
                Arguments.of("both are null", null, null, true),
                Arguments.of("both are empty", "", "", true),
                Arguments.of("null and empty", null, "", false),
                Arguments.of("null and non-empty", null, "abc", false),
                Arguments.of("empty and null", "", null, false),
                Arguments.of("empty and non-empty", "", "abc", false),
                Arguments.of("non-empty and empty", "abc", "", false),
                Arguments.of("non-empty and null", "abc", null, false),

                // logic cases
                Arguments.of("different length", "abc", "ab", false),
                Arguments.of("is permutation", "abc", "bac", true),
                Arguments.of("not permutation", "abc", "abd", false),

                // weird cases
                Arguments.of("unicode, is permutation", "TiếngViệt", "iTếngiVtệ", true),
                Arguments.of("unicode, not permutation", "你好", "你", false)
        );
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("testCases")
    void testCheckPermutationV1(String caseName, String n1, String n2, boolean expect) {
        boolean actual = checkPermutationV1(n1, n2);
        assertEquals(expect, actual, caseName);
    }

    @Test
    void testEmpty() {
        String a = "";
        String c = "";
        String b = new String(); // int pool
        System.out.printf("a = '%s'\n", a);
        System.out.printf("b = '%s'\n", b);
        System.out.printf("a == b ??  %s\n", a == b);//true - string pool
        System.out.printf("a == c ??  %s\n", a == c);//true - string pool
        System.out.printf("Objects.equals(a, b) = %s\n", Objects.equals(a, b));//false - dif ref
        System.out.printf("Objects.equals(a, c) = %s\n", Objects.equals(a, c));//false - dif ref
    }
}
