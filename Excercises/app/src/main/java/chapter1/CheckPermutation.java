package chapter1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    public static boolean checkPermutationV3(String a, String b) {
        if (a == null || b == null) {
            return (a == null) == (b == null);
        }

        if (a.length() != b.length()) {
            return false;
        }

        /*
         +   a   b a c
         -   b   a c a
                     ^
                     {a: 0, b: 0, c: 0 }

         +   a   d a c
         -   b   a c a
                     ^
                     {a: 0, b: -1, c: 0, d: 1}
         */

        // pre allocate the map to avoid the cost of memory allocation while looping
        // assuming (guessing) on average each character is repeated 4 times.
        Map<Character, Integer> m = new HashMap<>(a.length() / 4);
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            char y = b.charAt(i);
            m.put(x, m.getOrDefault(x, 0) + 1);
            m.put(y, m.getOrDefault(y, 0) - 1);
        }

        return m.values().stream().noneMatch(v -> v != 0);
    }
        

    public static boolean checkPermutationV2(String a, String b) {
        if (a == null || b == null) {
            return (a == null) == (b == null);
        }

        if (a.length() != b.length()) {
            return false;
        }

        Map<Character, Integer> ma = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            ma.put(x, ma.getOrDefault(x, 0) + 1);
        }

        Map<Character, Integer> mb = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char x = b.charAt(i);
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
