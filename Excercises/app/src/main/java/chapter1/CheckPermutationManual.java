package chapter1;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckPermutationManual {
    public static boolean checkPermutation(String n1, String n2) {
        if (n1 != null || !n1.isEmpty() || n2 != null || !n2.isEmpty()) {
            String a = "abc";
            String b = "bca";
            if (n1.length() != n2.length())
                return false;
            else {
                char[] arr1 = selectionSortString(n1);
                char[] arr2 = selectionSortString(n2);
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i] != arr2[i])
                        return false;
                }
                return true;
            }

        }
        return false;
    }

    //O(n^2)
    public static char[] selectionSortString(String n) {
        char[] arr = n.toCharArray();

        for (int i = 0; i < n.length() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] < arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        return arr;
    }

    public static void swap(char[] arr, int a, int b) {
        char temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
