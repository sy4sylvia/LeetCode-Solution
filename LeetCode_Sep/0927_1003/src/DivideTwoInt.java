//10/02
//29 Divide Two Integers
//time limit exceeded O(n)
public class DivideTwoInt {
    public int divide(int dividend, int divisor) {
        int result = 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1)  result = Integer.MAX_VALUE;
        else if (dividend == 0) result = 0;
        else if ((dividend > 0 && divisor > 0) || dividend < 0 && divisor < 0) {
            result = helper(dividend, divisor);
        }
        else if ((dividend > 0 && divisor < 0) || dividend < 0 && divisor > 0) {
            result = -helper((dividend), divisor);
        }
        return result;
    }
    public int helper(int dividend, int divisor) {
        int count = 0;
        while (Math.abs(dividend) >= Math.abs(divisor)) {
            dividend = Math.abs(dividend) - Math.abs(divisor);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        DivideTwoInt dti = new DivideTwoInt();
        int answer = dti.divide(-2147483648, -1);
        System.out.println(answer);
    }
}
