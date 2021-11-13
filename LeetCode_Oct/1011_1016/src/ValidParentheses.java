//1013
//20 Valid Parentheses

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0) return false; //parentheses have to be in pairs
        else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') st.push(')');
                else if (c == '{') st.push('}');
                else if (c == '[') st.push(']');
                else if (st.isEmpty() || st.peek() != c) return false;
                //be aware of how to handle null pointer situations
                else {
                    st.pop();
                }
            }
            return st.isEmpty();
        }
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String example = "[]}";
        System.out.println(vp.isValid(example));
    }
}
