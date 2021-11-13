////151
//


import java.util.Stack;

public class ReverseWords {
    public String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        char[] data = s.toCharArray();
        int stIdx = 0, edIdx;
        while (stIdx < data.length) {
            while (stIdx < data.length && data[stIdx] == ' ') stIdx++;  // 一开始就是空格的情况
            if (stIdx > data.length - 1) break;                         // 如果已经尾部了那直接退出

            edIdx = stIdx;
            while (edIdx < data.length && data[edIdx] != ' ') edIdx++;
            char[] tmp = new char[edIdx - stIdx];
            System.arraycopy(data, stIdx, tmp, 0, edIdx - stIdx);   // 把data的[stIdx, edIdx - 1] copy到tmp

            stack.push(String.valueOf(tmp));
            stIdx = edIdx;      // 此时edIdx一定是空格或者到了尾部，stIdx直接跳过他就好
        }


        StringBuilder sb = new StringBuilder();     // 用stringbuilder创造最后的输出
        while (!stack.isEmpty()) {                  // 逐步从stack取出单词
            sb.append(stack.pop());
            if (!stack.isEmpty()) sb.append(" ");
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        ReverseWords lc = new ReverseWords();
        String a = "  hello world  ";
        System.out.println(a);
        System.out.println(lc.reverseWords(a));
    }

}
//    public String reverseWords(String s) {
//        char[] c = s.toCharArray();
//        int left = 0, right = c.length - 1;
//        char[] c1 = new char[c.length];
//
//        int count = 0;
//        int i = 0;
//        while(i < c.length) {
//            if (c[i] == ' ') {
//                right = i - 1;
//                count++;
//            }
//            i++;
//        }
//
//
//
////        while (count < c.length)
////        for (int i = 0; c[i] != ' '; i++) {
////            c1[i] = c[i];
////            count++;
////        }
//
//
//
//
//        String s2 = String.valueOf(c);
//        return s2;
//    }
//
//    public static void main(String[] args) {
//        ReverseWords rw = new ReverseWords();
//        String s = "the sky is blue";
//        System.out.println(rw.reverseWords(s));
//
//    }
//}
