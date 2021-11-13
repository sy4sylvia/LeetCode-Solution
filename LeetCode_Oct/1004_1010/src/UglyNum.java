//10/06
//263 Ugly Number
public class UglyNum {
    public boolean isUgly(int n) {
        while (n > 0) {
            if (n % 2 == 0) n /= 2;
            else {
                if (n % 3 == 0) n /= 3;
                else {
                    if (n % 5 == 0) n /= 5;
                    else break;
                }
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNum un = new UglyNum();
        System.out.println(un.isUgly(8));
    }
}
