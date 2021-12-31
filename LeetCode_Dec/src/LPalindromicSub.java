//1216
//5. Longest Palindromic Substring

public class LPalindromicSub {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        StringBuilder res = new StringBuilder();
        int[][] dp = new int[s.length() + 1][s.length() + 1];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (s.charAt(i - 1) == reverse.charAt(j - 1)) {
                    res.append(s.charAt(i - 1));
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }


        String newString = "";
        String tmp = res.toString();
        for (int i = 0; i < s.length(); i++) {
            newString = tmp.replaceAll(Character.toString(s.charAt(i)), "");
        }

//        System.out.println(newString);
        return newString;
    }

    public static void main(String[] args) {
        LPalindromicSub lps = new LPalindromicSub();
        System.out.println(lps.longestPalindrome("cbbd"));
    }
}
