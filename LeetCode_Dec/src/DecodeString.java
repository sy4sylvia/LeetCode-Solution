//1210
//394 Decode String

import java.util.Stack;

public class DecodeString {

    public String decodeString(String s) {
        String ans = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {
                stringStack.push(ans);
                ans = "";
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder tmp = new StringBuilder(stringStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) tmp.append(ans);
                ans = tmp.toString();
                idx++;
            }
            else {
                ans += s.charAt(idx);
                idx++;
            }
        }
        return ans;
    }

//    int idx = 0;
//
//    public String decodeString(String s) {
//        //recursion
//        StringBuilder sb = new StringBuilder();
//        char[] c = s.toCharArray();
//
//        while (idx < s.length() && c[idx] != ']') {
//            if (!Character.isDigit(c[idx])) {
//                sb.append(c[idx]);
//                idx++;
//            }
//            else { //char is digit
//                int k = 0;
//                // build k while next character is a digit
//                while (idx < s.length() && Character.isDigit(c[idx])) {
//                    k = k * 10 + c[idx] - '0';
//                    idx ++; // skip '['
//                }
//                idx++;
//                String internalString = decodeString(s);
//                idx++; // skip ']'
//                while (k > 0) {
//                    sb.append(internalString);
//                    k--;
//                }
//            }
//        }
//        return sb.toString();
//    }

    public static void main(String[] args) {
        String s = "abc3[cd]xyz";
        DecodeString ds = new DecodeString();
        System.out.println(ds.decodeString(s));
    }
}
