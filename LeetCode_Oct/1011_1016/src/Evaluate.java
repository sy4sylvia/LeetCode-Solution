//150 Evaluate Reverse Polish Notation
//1014

import java.util.Stack;

public class Evaluate {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                st.push(tokens[i]);
            }
            else {
                int a = Integer.parseInt(st.pop());
                int b = Integer.parseInt(st.pop());
                if (tokens[i].equals("+")) st.push(String.valueOf(b + a));
                else if (tokens[i].equals("-")) st.push(String.valueOf(b - a));
                else if (tokens[i].equals("*")) st.push(String.valueOf(b * a));
                else st.push(String.valueOf(b / a));
            }
        }
        return Integer.parseInt(st.pop());
    }

    public static void main(String[] args) {
        Evaluate eee = new Evaluate();
        String[] example = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(eee.evalRPN(example));

    }
}
