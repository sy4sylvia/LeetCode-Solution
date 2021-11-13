public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        else {
            int tmp = 0, count = 0;
            for (int i = 0; i < 32; i++) {
                tmp <<= 1;
                if ((n & 1) == 1) {
                    tmp++;
                    count++;
                }
                n >>= 1;
            }
            return count == 1;
        }
    }
}
