package chapter1;

import java.util.Arrays;

public class CheckPermutation {
    // O(n log n) due to using Arrays.sort
    public static boolean checkPermutationV1(String a, String b) {
        if (a == null || b == null) {
            return (a == null) == (b == null);
        }

        if (a.length() != b.length()) {
            return false;
        }

        char[] arr1 = a.toCharArray(); // O(n)
        char[] arr2 = b.toCharArray(); // O(n)
        Arrays.sort(arr1); // O(n log n)
        Arrays.sort(arr2); // O(n log n)

        for (int i = 0; i < arr1.length; i++) { // O(n)
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
