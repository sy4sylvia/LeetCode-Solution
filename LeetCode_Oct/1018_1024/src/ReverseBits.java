import java.util.Stack;

public class ReverseBits {
    public int reverseBits(int n) {

//        if (n == 0) return 0;
//        else {
//            int tenBase = Integer.parseInt(String.valueOf(n), 2);
//            String s = String.valueOf(tenBase);
//            char[] c = s.toCharArray();
//            Stack<Character> sta = new Stack<>();
//            for (int i = 0; i < c.length; i++) sta.push(c[i]);
//            char[] cReverse = new char[c.length];
//            for (int i = 0; i < c.length; i++) cReverse[i] = sta.pop();
////            int bitRes = Integer.parseInt(String.valueOf(cReverse));
//            return Integer.parseInt(String.valueOf(cReverse), 2);
//        }

        if (n == 0) return 0;
        else {
            int result = 0;
            for (int i = 0; i < 32; i++) {
                result <<= 1;
                if ((n & 1) == 1) result++;
                n>>= 1;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        ReverseBits rb = new ReverseBits();
//        System.out.println(rb.reverseBits(00_000_010_100_101_000_001_111_010_011_100));
        }
}
