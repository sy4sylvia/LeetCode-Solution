//1026
//7 Reverse Integer

import java.util.Stack;

public class ReverseInt {
    //mathematical way
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            //detecting overflow
            if ((result == Integer.MAX_VALUE / 10 && pop > 7) || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0;
            }
            result = pop + result * 10;
        }
        return result;
    }
    //runtime error; overflow
    //boundary is tricky
//    public int reverse(int x) {
//        if (x == 0) return 0;
//        else if (x > 0) {
//            String s = String.valueOf(x);
//            char[] c = s.toCharArray();
//            Stack<Character> sta = new Stack<>();
//            for (int i = 0; i < c.length; i++) sta.push(c[i]);
//            if (sta.size() > 7) return 0;
//            else {
//                char[] cReverse = new char[c.length];
//                for (int i = 0; i < c.length; i++) {
//                    if (sta.peek() != 0) cReverse[i] = sta.pop();
//                }
//                return Integer.parseInt(String.valueOf(cReverse));
//            }
//        }
//        else {
//            String s = String.valueOf(-x);
//            char[] c = s.toCharArray();
//            Stack<Character> sta = new Stack<>();
//            for (int i = 0; i < c.length; i++) sta.push(c[i]);
//            if (sta.size() > 8) return 0;
//            else {
//                char[] cReverse = new char[c.length];
//                for (int i = 0; i < c.length; i++) {
//                    if (sta.peek() != 0) cReverse[i] = sta.pop();
//                }
//                return Integer.parseInt(String.valueOf(cReverse)) * (-1);
//            }
//
//        }
//    }

    public static void main(String[] args) {
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverse(-1534236469));
    }
}
