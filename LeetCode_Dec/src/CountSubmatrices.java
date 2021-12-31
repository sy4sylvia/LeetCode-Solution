//1217
//1277. Count Square Submatrices with All Ones
public class CountSubmatrices {
    public int countSquares(int[][] matrix) {
        int res = 0;
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m + 1][n + 1];
        //dp[i][j] means the size of biggest square with A[i][j] as bottom-right corner.
        //dp[i][j] also means the number of squares with A[i][j] as bottom-right corner.
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == 1) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
                res += dp[i][j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CountSubmatrices cs = new CountSubmatrices();
        int[][] m = {{1, 1}, {1, 1}, {0, 1}};
        System.out.println(cs.countSquares(m));
    }
}
