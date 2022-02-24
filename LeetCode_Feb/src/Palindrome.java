import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Palindrome {
    //125 Valid Palindrome
    //0206
    public boolean isPalindrome(String s) {
        List<Character> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (!Character.isLetter(tmp)) continue;
            if (tmp >= 65 && tmp <= 90) tmp += 32; // convert into lower case
            l.add(tmp);
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sbReverse = new StringBuilder();
        for (int i = 0; i < l.size(); i++) {
            sb.append(l.get(i));
            sbReverse.append(l.get(l.size() - i - 1));
        }
        return sb.toString().equals(sbReverse.toString());
    }

    //0206
    //5. Longest Palindromic Substring
    public String longestPalindrome(String s) {
        List<int[]> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            l.add(helper(s, i, i));
            l.add(helper(s, i, i + 1));
        }
        Collections.sort(l, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        int left = l.get(0)[0], right = l.get(0)[1];
        return s.substring(left, right + 1);
    }

    private int[] helper(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) break;
            left--;
            right++;
        }
        int[] res = {left, right, right - left + 1};
        return res;
    }

    public static void main(String[] args) {
        String s = "0123456";
        System.out.println(s.substring(3));
    }
}
