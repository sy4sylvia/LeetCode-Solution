//1101
//557. Reverse Words in a String III

import java.util.Arrays;

public class ReverseWords3 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" ");
        char[] c = sb.toString().toCharArray();
//        helpReverse(c, 0, c.length - 1);
        int anotherStart = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                helpReverse(c, anotherStart, i - 1);
                anotherStart = i + 1;
            }
        }
        char[] c2 = Arrays.copyOfRange(c, 0, c.length - 1);
        return String.valueOf(c2);
    }

    private void helpReverse(char[] c, int start, int end) {
        while (start < end) {
            char tmp = c[start];
            c[start++] = c[end];
            c[end--] = tmp;
        }
    }

    public static void main(String[] args) {
        ReverseWords3 rw3 = new ReverseWords3();
        String s = "Let's take LeetCode contest";
        System.out.println(rw3.reverseWords(s));
    }
}
