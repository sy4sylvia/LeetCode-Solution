//10/06
//202 Happy Number

import java.util.HashMap;
import java.util.HashSet;

public class HappyNum {
    public boolean isHappy(int n) {
//        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<Integer>();
        if (n == 1) return true;
        else {
            while (n != 1 && !hs.contains(n)) {
                hs.add(n);
                n = sum(n);
            }
            return n == 1;
        }
    }

    private int sum(int n) {
        int res = 0;
        while (n > 0) {
            int tmp = n % 10;
            res += tmp * tmp;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        HappyNum hn = new HappyNum();
        System.out.println(hn.isHappy(123));
    }
}
