//1023
//29 Divide Two Integers

import java.awt.*;

public class DivideTwoInt {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int negative = 2;
        if (dividend > 0) {
            negative --;
            dividend = -dividend; // convert into a negative number
        }
        if (divisor > 0) {
            negative--;
            divisor = -divisor;
        }
        int count = 0;
        while (dividend <= divisor) {
            count--;
            dividend -= divisor;
        }
        if (negative == 1) return count;
        else return -count;
    }
    // Math.abs causes overflow
//    public int divide(int dividend, int divisor) {
//        if (dividend == 0) return 0;
//        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
//
//        int count = 0;
//
//        if (dividend > 0) {
//            if (divisor > 0) {
//                while (dividend >= divisor) {
//                    dividend -= divisor;
//                    count++;
//                }
//                return count;
//            }
//            else {
//                while (dividend >= Math.abs(divisor)) {
//                    dividend -= Math.abs(divisor);
//                    count++;
//                }
//                return -count;
//            }
//        }
//        else {
//            int positiveDividend = -dividend;
//            if (divisor > 0) {
//                while (positiveDividend >= divisor) {
//                    positiveDividend -= divisor;
//                    count++;
//                }
//                return -count;
//            }
//            else {
//                while (positiveDividend >= Math.abs(divisor)) {
//                    positiveDividend += divisor;
//                    count++;
//                }
//                return count;
//            }
//        }
//    }

    public static void main(String[] args) {
        DivideTwoInt dti = new DivideTwoInt();
        System.out.println(dti.divide(-10, 1));
    }
}
