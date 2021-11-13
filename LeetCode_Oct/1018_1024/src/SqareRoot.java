//1025
//69 Sqrt(x)

public class SqareRoot {
    public int mySqrt(int x) {
        double root = x;
        while (root * root > x) {
            root = (x / root + root ) / 2.0;
        }
        return (int)root;
    }

    public static void main(String[] args) {
        SqareRoot r = new SqareRoot();
        System.out.println(r.mySqrt(225));
    }
}
