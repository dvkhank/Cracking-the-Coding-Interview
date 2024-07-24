package chapter1;

public class URLify {
//    public static char[] doURLify(String n) {
//        int countSpace = 0;
//        if (n != null && !n.isEmpty()) {
//            char[] arr = n.toCharArray();
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == ' ')
//                    countSpace = countSpace + 1;
//            }
//            char[] newArr = new char[arr.length + countSpace * 2];
//
//            int i = 0;
//            int j = 0;
//            while (i < arr.length) {
//                if (arr[i] == ' ') {
//                    newArr[j++] = '%';
//                    newArr[j++] = '2';
//                    newArr[j++] = '0';
//                    i = i + 1;
//                } else {
//                    newArr[j++] = arr[i++];
//                }
//
//            }
//            return newArr;
//        }
//        return "Please enter correctly string".toCharArray();
//
//    }

    public static char[] doURLify(String n) {
        char[] arr = n.toCharArray();
        int countSpace = 0;
        for (char x : arr)
            if (x == ' ')
                countSpace++;

        char[] newArr = new char[arr.length + countSpace * 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ' ') {
                newArr[j++] = '%';
                newArr[j++] = '2';
                newArr[j++] = '0';
            } else {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
}