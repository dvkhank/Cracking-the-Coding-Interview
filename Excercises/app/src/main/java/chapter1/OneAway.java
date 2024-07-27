package chapter1;

public class OneAway {


    public static boolean doOneWay(String n1, String n2) {
        if (Math.abs(n1.length() - n2.length()) > 1)
            return false;
        if (n1.length() == n2.length())
            return checkReplace(n1, n2);
        if (n1.length() + 1 == n2.length())
            return checkEditorDelete(n1, n2);
        if (n2.length() + 1 == n1.length())
            return checkEditorDelete(n2, n1);
        return false;
    }


    public static boolean checkReplace(String n1, String n2) { //Only differ 1 word
        int count = 0;
//        int index1 = 0;
//        int index2 = 0;
//        while (index1 < n1.length() && index2 < n2.length()) {
//            if (n1.charAt(index1) != n2.charAt(index2)) {
//                count++;
//            } else {
//                index1++;
//                index2++;
//            }
//        }
        for (int i = 0; i < n1.length(); i++) {
            if (n1.charAt(i) != n2.charAt(i))
                count++;
        }
        if (count > 1)
            return false;
        else
            return true;
    }


    public static boolean checkEditorDelete(String n1, String n2) {
        int index1 = 0;
        int index2 = 0;
        while (index1 < n1.length() && index2 < n2.length()) {
            if (n1.charAt(index1) != n2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        return true;

    }
}
