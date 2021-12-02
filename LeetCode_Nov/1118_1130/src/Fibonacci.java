//1122
//509. Fibonacci Number

public class Fibonacci {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] fibNum = new int[n + 1];
        fibNum[0] = 0;
        fibNum[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
        }
        return fibNum[n];
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fib(4));
    }
}
