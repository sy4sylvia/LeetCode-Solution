//191 Number of 1 Bits
//1027

public class NumOfBits {
    public int hammingWeight(int n) {
        if (n == 0) return 0;
        else {
            int result = 0, count = 0;
            for (int i = 0; i < 32; i++) {
                result <<= 1;
                if ((n & 1) == 1) {
                    result++;
                    count++;
                }
                n>>= 1;
            }
            return result;
        }
    }

}
