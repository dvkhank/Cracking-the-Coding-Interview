package chapter1;

public class StringCompression {
    public static String doStringCompression(String n) {
        if (n.length() != 0 && !n.isEmpty()) {
            char currentChar = n.charAt(0);
            int count = 1;
            StringBuilder compress = new StringBuilder();
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == currentChar) {
                    count++;
                } else {
                    compress.append(currentChar).append(count);
                    currentChar = n.charAt(i);
                    count = 1;
                }
            }
            compress.append(currentChar).append(count);
            String compressedString = compress.toString();
            return compressedString.length() < n.length() ? compressedString : n;
        }
        return n;
    }
}
