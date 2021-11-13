//0927
//151 Reverse Words in a String
// two-pointer

import java.awt.*;
import java.util.*;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        int left = 0, right = s.length() - 1;

        while (left <= right && s.charAt(left) == ' ') left++;
        while (left <= right && s.charAt(right) == ' ') right--;

        Deque<String> d = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        while (left <= right) {
            char c = s.charAt(left);
            if ((sb.length() != 0) && (c == ' ')) {
                d.offerFirst(sb.toString());
                sb.setLength(0);
            }
            else if (c != ' ') {
                sb.append(c);
            }
            left++;
        }
        d.offerFirst(sb.toString());
        return String.join(" ", d);
//            if (s.charAt(left) != ' ') sb.append(c);
//            else if (s.charAt(left - 1) != ' ') sb.append(c);
//            ++left;

    }



//    public String reverseWords(String s) {
//        char[] c = s.toCharArray();
//        int l = c.length;
//        char[] arr = new char[c.length];
//        String[] tmp = new String[c.length];
//        int count = 0;
//        String result = "";
//
//        for(int i = 0; i < l; i++) {
//            if(c[i] != ' ') {
////                arr[i] = c[i];
//                tmp[i] = String.valueOf(c[i]);
////            }
////            else {
////                tmp[i] = " ";
//            }
//        }
//
//        for(int k = l - 1; k >= 0; k--) {
//            if(tmp[k] != null) count++;
//        }
//
//        int left = 0, right = count - 1;
//
//        for(int j = 0; j < count - 1; j++) {
//            while(left < count - 1 && right > 0) {
//                tmp[left] += tmp[right];
//                tmp[right] = tmp[left].substring(0, tmp[left].length() - tmp[right].length());
//                tmp[left] = tmp[left].substring(tmp[right].length());
//                left++;
//                right--;
//            }
//        }
//
//        for(int k = 0; k < count - 1; k++) {
//            result += tmp[k] + " ";
//        }
//        result = result + tmp[count - 1];
//        return result;
//    }
    public static void main(String[] args) {
        ReverseWordsInAString r = new ReverseWordsInAString();
        System.out.println(r.reverseWords("the sky is blue"));
    }
}
