//1101
//186 Reverse Words in a String II

import java.util.Stack;

public class ReverseWords2 {
    public void reverseWords(char[] s) {
        //reverse the whole char[]
        helpReverse(s, 0, s.length - 1);
        //inside the char[], reverse char
        int newStart = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i] == ' ') {
                helpReverse(s, newStart, i - 1);
                newStart = i + 1;
            }
        }
        helpReverse(s, newStart, s.length - 1);
    }

    private void helpReverse(char[] s, int start, int end) {
        while (start < end) {
            char tmp = s[start];
            s[start++] = s[end];
            s[end--] = tmp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', ' ', 'e', 'g', 'g'};
        for (int i = 0; i < s.length; i++) System.out.print(s[i]);
        ReverseWords2 rw2 = new ReverseWords2();
        rw2.reverseWords(s);
        for (int c = 0; c < s.length; c++) System.out.print(s[c]);
    }
}
