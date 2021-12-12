//1211
//67 Add Binary

import java.math.BigInteger;

public class AddBinary {

    //bit manipulation
    public String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, ans;
        while (y.compareTo(zero) != 0) {
            ans = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = ans;
            y = carry;
        }
        return x.toString(2);
    }

    public static void main(String[] args) {
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary("1", "10"));
    }
}
