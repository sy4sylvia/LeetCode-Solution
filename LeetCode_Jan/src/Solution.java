
import java.util.HashSet;

class Solution {
    //0106
    //3. Longest Substring Without Repeating Characters
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) return s.length();
        int left = 0, right = left + 1;
        int res = 1;

        HashSet<Character> hs = new HashSet<>();
        hs.add(s.charAt(left));

        while (right < s.length()) {
            if (s.charAt(left) != s.charAt(right) && !hs.contains(s.charAt(right))) {
                hs.add(s.charAt(right));
                res = Math.max(res, right - left + 1);
                right++;
            }
            else {
                left++;
                hs = new HashSet<>();
                hs.add(s.charAt(left));
                right = left + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abcabcbb"));
    }
}