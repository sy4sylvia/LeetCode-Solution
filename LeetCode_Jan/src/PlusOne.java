//0103
//66 Plus One

import java.sql.Array;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        //no carry
        int[] noCarry = new int[digits.length];
        //carry
        int[] carry = new int[digits.length + 1];

        int lastDigit = digits.length - 1;

        if (digits[lastDigit] < 9) {
            noCarry[lastDigit] = digits[lastDigit] + 1;
            System.arraycopy(digits, 0, noCarry, 0, digits.length - 1);
            return noCarry;
        }
        else {
            System.arraycopy(digits, 0, noCarry, 0, digits.length);
            for (int i = lastDigit; i >= 0; i--) {
                if (digits[i] != 9) {
                    noCarry[i] = digits[i] + 1;
                    break;
                }
                else noCarry[i] = 0;
            }
            if (noCarry[0] == 0) {
                carry[0] = 1;
                return carry;
            }
            else return noCarry;
        }
    }

    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] digits = {9, 1, 9, 9};
        int[] ans = po.plusOne(digits);
        for (int a : ans) System.out.print(a + " ");
    }
}
