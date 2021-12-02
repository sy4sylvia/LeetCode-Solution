//1129
//96 Unique Binary Search Trees
//1 <= n <= 19

public class UniqueBST {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
                //dp[j - 1] leftSubTree, dp[i - j] rightSubTree
                // i nodes in total
            }
        }
        return dp[n];
    }
}
