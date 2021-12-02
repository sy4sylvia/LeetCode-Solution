//1122
//70 Climbing Stairs

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            //previous: 1 step, dp[i - 1] ways of getting here
            //previous: 2 steps, dp[i - 2] ways of getting here
        }
        return dp[n];
    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(3));
    }
}
