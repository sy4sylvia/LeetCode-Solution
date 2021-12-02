//1122
//1137 N-th Tribonacci Number
public class Tribonacci {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        int[] tri = new int[n + 2];
        tri[0] = 0;
        tri[1] = 1;
        tri[2] = 1;
        for (int i = 3; i < n + 2; i++) tri[i] = tri[i - 3] + tri[i - 2] + tri[i - 1];
        return tri[n];
    }

    public static void main(String[] args) {
        Tribonacci t = new Tribonacci();
        System.out.println(t.tribonacci(25));
    }
}
