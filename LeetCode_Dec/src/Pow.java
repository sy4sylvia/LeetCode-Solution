//1209
//50 Pow(x, n)

//-2^31 <= n <= 2^31-1, should be aware of overflow?

public class Pow {
    public double myPow(double x, int n) {
//        if (n == 0) return 1;
//        if (n < 0) {
//            n *= -1;
//            x = 1 / x;
//        }
//        if (n % 2 == 0) {
//            return myPow(x * x, n / 2);
//        }
//        else return x * myPow(x * x, n / 2);
//    }
//
//        //to make n smaller
//

        if (n < 0) {
            n *= -1;
            x = 1 / x;
        }

        int sqrt1 = (int)Math.sqrt(n);
        double power = x;
        if (x == 0) return 0.0;
        int count = 1;
        while (count < sqrt1) {
            power *= x;
            count++;
        }
//        power *= power;
        double tmp = power;
        int count2 = 1;
        while (count2 < sqrt1) {
            power *= tmp;
            count2++;
        }
        if (sqrt1 * sqrt1 != n) {
            int rest = n - sqrt1 * sqrt1;
            int count3 = 1;
            while (count3 <= rest) {
                power *= x;
                count3++;
            }
        }
        return power;
    }

    public static void main(String[] args) {
        Pow p = new Pow();
        System.out.println(p.myPow(2, -2));
    }
}
