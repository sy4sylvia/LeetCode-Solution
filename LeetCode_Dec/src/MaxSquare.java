//1216
//221 Maximal Square

//Integer.valueOf('0') = 48
public class MaxSquare {
    public int maximalSquare(char[][] matrix) {
        int max = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[][]dp = new int[m + 1][n + 1];

        //initialization?
        for (int i = 0; i < m; i++) dp[i][0] = (int) matrix[i][0] - 48;
        for (int j = 0; j < n; j++) dp[0][j] = (int) matrix[0][j] - 48;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j] , dp[i][j - 1])) + 1;

//                    if (matrix[i - 1][j] =='0' && matrix[i][j - 1] == '0') {
//                        dp[i][j] = 1;
//                    }
//                    else {
//                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j] + dp[i][j - 1];
//                    }
//
                }
//                else dp[i][j] = 0;
                max = Math.max(max, dp[i][j]);
            }
        }

        return max * max;
    }

    public static void main(String[] args) {
        MaxSquare ms = new MaxSquare();
        char[][] matrix ={{'1', '1'}, {'1', '1'}, {'1', '1'}};
        System.out.println(ms.maximalSquare(matrix));
    }
}
