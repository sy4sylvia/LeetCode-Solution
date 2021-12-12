//1211
//371 Sum of Two Integers

import java.math.BigInteger;

public class Sum2Int {
    public int getSum(int a, int b) {
        while (b != 0) {
            int res = a ^ b;
            int carry = (a & b) << 1;
            a = res;
            b = carry;
        }

        return a;
    }


    public static void main(String[] args) {
        Sum2Int sum2Int = new Sum2Int();

        System.out.println(sum2Int.getSum(100, 1000));
    }
}
