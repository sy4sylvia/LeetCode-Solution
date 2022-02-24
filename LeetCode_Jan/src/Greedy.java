import com.sun.security.auth.NTSidUserPrincipal;

import java.util.*;

public class Greedy {
    //738
    public int monotoneIncreasingDigits(int n) {
        String val = Integer.toString(n);
        if (val.length() == 1) return n;

        int[] digits = new int[val.length()];
        for (int i = 0; i < digits.length; i++) digits[i] = val.charAt(i) - '0';

        int violate = 0;
        boolean flag = true;
        for (int i = 1; i < digits.length; i++) {
            System.out.println(digits[i]);

            //find the violating number
            if (digits[i - 1] > digits[i]&& flag) {
                violate = i - 1;
                flag = false;
            }
        }
        if (violate == 0) return n;
        else {
            digits[violate - 1]--;
            for (int i = violate; i < digits.length; i++) digits[i] = 9;
            int res = 0;
            for (int i = 0; i < digits.length; i++) res = res * 10 + digits[i];
            return res;
        }
    }

    //763 Partition Labels
    public List<Integer> partitionLabels(String s) {
        List<Integer> subSize = new ArrayList<>();

        if (s.length() == 1) {
            subSize.add(1);
            return subSize;
        }

        int[][] startEnd = new int[26][2];

        boolean[] startFlag = new boolean[26];
        Arrays.fill(startFlag, true);

        for (int i = 0; i < s.length(); i++) {
            int tmp = s.charAt(i) - 'a';
            if (startFlag[tmp]) startEnd[tmp][0] = i; //startIdx
            startFlag[tmp] = false;
            startEnd[tmp][1] = i; //endIdx
        }

        List<int[]> l = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (!startFlag[i] || startEnd[i][1] != 0) l.add(startEnd[i]);
        }

        int[][] intervals = new int[l.size()][2];
        for (int i = 0; i < l.size(); i ++) {
            intervals[i] = l.get(i);
            System.out.println(intervals[i][0] + " " + intervals[i][1]);
        }

        int[][] ans = merge(intervals);
        for (int i = 0; i < ans.length; i++) subSize.add(ans[i][1] - ans[i][0] + 1);

        //s = "ababcbacadefegdehijhklij"
        //-> a: 0 ~ 8; b: 1 ~ 5, c: 4 ~ 7
        //d: 9 ~14, e: 10 ~15, f: 11, g:13~13

        return subSize;
    }

    private int[][] merge(int[][] intervals) {
        if (intervals.length == 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        List<int[]> l = new ArrayList<>();
        int[] subArr = intervals[0];
        l.add(subArr);
        for (int[] oriSub : intervals) {
            if (subArr[1] >= oriSub[0]) subArr[1] = Math.max(subArr[1], oriSub[1]);
            else {
                subArr = oriSub;
                l.add(subArr);
            }
        }
        int[][] ans = new int[l.size()][2];
        for (int i = 0; i < l.size(); i ++) ans[i] = l.get(i);
        return ans;
    }

    public static void main(String[] args) {
        Greedy g = new Greedy();
//

        System.out.println(g.partitionLabels("caedbdedda"));
        String s = "abaaba";
        char c = '1';
        String ste = String.valueOf(c);
        String st = ste.substring(0, 1);

        System.out.println(s.substring(1, s.length() - 1));
    }
}
