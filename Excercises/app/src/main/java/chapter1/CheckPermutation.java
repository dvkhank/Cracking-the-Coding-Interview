package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    public static boolean checkPermutationV2(String a, String b) {
        if (a == null || b == null) {
            return (a == null) == (b == null);
        }

        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> ma = new HashMap<>();
        for (char x : a.toCharArray()) {
            ma.put(x, ma.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> mb = new HashMap<>();
        for (char x : b.toCharArray()) {
            mb.put(x, mb.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : ma.entrySet()) {
            char key = entry.getKey();
            int freqA = entry.getValue();
            int freqB = mb.getOrDefault(key, 0);
            if (freqB != freqA) {
                return false;
            }
        }

        return true;
    }

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
