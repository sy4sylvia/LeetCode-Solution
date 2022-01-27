//0104
//131. Palindrome Partitioning

//backtrack

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

//131. Palindrome Partitioning

public class PalindromeP {

    List<List<String>> res = new ArrayList<>();
    List<String> path = new LinkedList<>();

    public List<List<String>> partition(String s) {
        backtrack(s, 0);
        return res;
    }

    private void backtrack(String s, int startIdx) {
        //base case, termination
        if (startIdx == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIdx; i < s.length(); i++) {
            if (isPalindrome(s, startIdx, i)) {
                String cur = s.substring(startIdx, i + 1);
                path.add(cur);
            }
            else continue;
            backtrack(s, i + 1); //continue on the same branch, so i + 1
            path.remove(path.size() - 1);
            Arrays.sort(path.toArray());

        }
    }

    private boolean isPalindrome(String s, int startIdx, int endIdx) {
        while (startIdx < endIdx) {
            if (s.charAt(startIdx)!= s.charAt(endIdx)) return false;
            startIdx++;
            endIdx--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeP pp = new PalindromeP();
        String s =  "aab";
        System.out.println(pp.partition(s));

    }
}

