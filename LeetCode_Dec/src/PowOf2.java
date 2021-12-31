//1220
//231 Power of Two

public class PowOf2 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        else {
            String binary = Integer.toString(n, 2);
            int count = 0;
            for (int i = 0; i < binary.length(); i++) {
                if (binary.charAt(i) == '1') count++;
            }
            return count == 1;
        }
    }
}
