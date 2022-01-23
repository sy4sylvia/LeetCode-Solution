import java.util.Stack;

//0118
//Decode String
public class DecodeString {
    public String decodeString(String s) {
        //FILO, Stack
        Stack<Integer> numeric = new Stack<>();
        Stack<String> letters = new Stack<>();

        StringBuilder cur = new StringBuilder();

        int idx = 0;
        while (idx < s.length()) {
            if (isDigit(s.charAt(idx))) { //[1, 300]
                int digit = 0;
                while (isDigit(s.charAt(idx))) { //more than one digit
                    digit = 10 * digit + s.charAt(idx) - '0';
                    idx++;
                }
                numeric.push(digit);
            }
            else if (s.charAt(idx) == '[') {
                letters.push(cur.toString());
                cur = new StringBuilder();
                idx++;
            }
            else if (s.charAt(idx) == ']') {
                StringBuilder tmp = new StringBuilder();
                tmp.append(letters.pop());
                int count = numeric.pop();
                for (int i = 0; i < count; i++) tmp.append(cur);
                cur = tmp;
                idx++;
            }
            else { //[cd]ef
                cur.append(s.charAt(idx++));
            }
        }
        return cur.toString();
    }

    private boolean isDigit(Character c) {
        return c >= '0' && c <= '9';
    }

    public static void main(String[] args) {
        DecodeString ds = new DecodeString();
        String s = "2[abc]3[cd]ef";
        System.out.println(ds.decodeString(s));
    }
}
