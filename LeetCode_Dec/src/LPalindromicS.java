//1216
//516. Longest Palindromic Subsequence

public class LPalindromicS {
    public int longestPalindromeSubseq(String s) {
        int sLen = s.length();
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        int[][] dp = new int[sLen + 1][sLen + 1];
        for (int i = 1; i <= sLen; i++) {
            for (int j = 1; j <= sLen; j++) {
                if (s.charAt(i - 1) == reverse.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[sLen][sLen];
    }

}
