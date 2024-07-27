package chapter1;

public class StringRotation {
    public static boolean doStringRotation(String n1, String n2) {
        if (n1.length() != n2.length() || n1.isEmpty() || n2.isEmpty()) {
            return false;
        }
        else {
            String concated = n1 + n2;
            return isSubString(concated, n1);
        }

    }
    private static  boolean isSubString(String n1, String n2) {
        return n1.contains(n2);
    }
}
