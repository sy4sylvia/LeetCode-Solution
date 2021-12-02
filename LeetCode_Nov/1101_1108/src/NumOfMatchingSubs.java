//1114
//792 Number of Matching Subsequences

import java.util.ArrayList;
import java.util.List;

public class NumOfMatchingSubs {
    // Time Complexity: O(M + N), time limit exceeded
//    public int numMatchingSubseq(String s, String[] words) {
//        char[] charOfS = s.toCharArray();
//        int count = 0;
//        for (String word : words) {
//            char[] w = word.toCharArray();
//            int sIndex = 0;
//            int wIndex = 0;
//            int flag = 0;
//            while (sIndex < s.length() && wIndex < w.length) {
//                if (charOfS[sIndex] == w[wIndex]) {
//                    wIndex++;
//                    flag++;
//                }
//                sIndex++;
//            }
//            if (flag == w.length) count++;
//        }
//        return count;
//    }


    public int numMatchingSubseq(String s, String[] words) {
        int count = 0;
        List<StringBuilder>[] wait = new List[26];
        for (int i = 0; i < 26; i++) wait[i] = new ArrayList<>();
        for (String w : words) {
            wait[w.charAt(0) - 'a'].add(new StringBuilder(w));
        }
        for (char c : s.toCharArray()) {
            List<StringBuilder> l = wait[c - 'a'];
            wait[c - 'a'] = new ArrayList<>();
            for (StringBuilder sb : l) {
                sb.deleteCharAt(0);
                if (sb.length() != 0) wait[sb.charAt(0) - 'a'].add(sb);
                else count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumOfMatchingSubs n = new NumOfMatchingSubs();
        String s = "sandcapitals";
        String[] words = {"andcap", "w", "sand", "cap"};
        System.out.println(n.numMatchingSubseq(s, words));
    }
}
