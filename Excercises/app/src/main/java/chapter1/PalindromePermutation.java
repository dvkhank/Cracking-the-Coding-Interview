package chapter1;

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static boolean doPalindromePermutation(String n) {
        //Clean and format
        char[] arr = n.trim().replaceAll(" ", "").toLowerCase().toCharArray();
        //Ex : "madam", "racecar", "aibohphobia", when we read from left to right and right to left are same.

        //Count the frequency of characters
        Map<Character, Integer> freqArr = new HashMap<>();

        for (char x : arr) {
            freqArr.put(x, freqArr.getOrDefault(x, 0) + 1);
        }

        int countOdd = 0;//Only 1 word in middle for string with odd(5,7..) length
        for (int x : freqArr.values()) {
            if (x % 2 == 1) //Because Palindrome can read from left side or right side. So every single char should appear 2 times
                countOdd++;
            if (countOdd > 1)
                return false;
        }
        return true;
    }
}
