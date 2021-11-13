//1013
//1047 Remove All Adjacent Duplicates in String

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class RmvAdjcntDup {
    public String removeDuplicates(String s) {
        if (s.length() == 1) return s;
        else {
            String result = "";
//            int[] table = new int[26]; didn't use HashMap eventually
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (st.isEmpty() || st.peek() != c) st.push(c);
                else st.pop();
            }
            while (!st.isEmpty()) result = st.pop() + result; //add char to String
            return result;
        }
    }

    public static void main(String[] args) {
        RmvAdjcntDup rr = new RmvAdjcntDup();
        String ex = "acaabbaacc";
        System.out.println(rr.removeDuplicates(ex));
    }
}
