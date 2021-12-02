//1128
//343 Integer Break

public class IntegerBreak {
    public int integerBreak(int n) {
        int[] dpProduct = new int[n + 1];
        dpProduct[2] = 1;
//        dpProduct[3] = 2;
//        int maxProduct = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dpProduct[i] = Math.max(dpProduct[i], Math.max((i - j) * j, dpProduct[i - j] * j));
            }
        }
        return dpProduct[n];
    }

    public static void main(String[] args) {
        IntegerBreak ib = new IntegerBreak();
        System.out.println(ib.integerBreak(58));
    }
}
