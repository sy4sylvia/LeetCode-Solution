//43 Multiply Strings
//1127

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.log10;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {

        long n1 = helperConvert(num1);
        long n2 = helperConvert(num2);
        if (n1 == 0 || n2 == 0) return "0";

        long p = n1 * n2;
        System.out.println(p);
        String product = String.valueOf(p);

        int digits = (int)Math.floor(Math.log10(p) + 1);
        StringBuilder sb = new StringBuilder();
        List<Long> l = new LinkedList<>();
        while (p > 0) {
            long remainder = p % 10;
            sb.append(remainder);
            l.add(remainder);
            p = p / 10;
        }
        Collections.reverse(l);


        System.out.println(digits);
        System.out.println(l);


        System.out.println(String.valueOf(l));

//        char[] cProduct = new char[l.size()];
//        for (int i = 0; i < l.size(); i++) {
//            cProduct = l.get(i).
//        }

        product = String.valueOf(l);
        return product;
    }

    private long helperConvert(String num) {
        long ans = 0;
        char[] c = num.toCharArray();
        for (int i = 0; i < c.length; i++) {
            ans += (long) Character.getNumericValue(c[i]) * (long)(Math.pow(10,(c.length - 1 - i)));
        }
        return ans;
    }

    public static void main(String[] args) {
        MultiplyStrings ms = new MultiplyStrings();
        System.out.println(ms.multiply("1435235151", "987654321232342"));
    }
}
