package chapter1;

public class IsUnique {
    public static boolean isUnique(String n) {
        if (n == null || n.length() == 0)
            return false;
        else {
            for (int i = 0; i < n.length() - 1; i++) {
                for (int j = i + 1; j < n.length(); j++) {
                    char a = n.charAt(i);
                    char b = n.charAt(j);
                    if (a == b) return false;
                }
            }
            return true;
        }
    }
}
