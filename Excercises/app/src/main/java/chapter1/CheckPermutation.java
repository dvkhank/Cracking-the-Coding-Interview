package chapter1;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean checkPermutation(String n1, String n2) {

        if (n1 != null && !n1.isEmpty() && n2 != null && !n2.isEmpty()) {
            if (n1.length() != n2.length())
                return false;
            else {
                char[] arr1 = n1.toCharArray();
                char[] arr2 = n2.toCharArray();

                //Sort
                Arrays.sort(arr1);
                Arrays.sort(arr2);

                return Arrays.equals(arr1, arr2);


            }

        }
        return false;

    }
}
