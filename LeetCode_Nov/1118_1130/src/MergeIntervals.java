//1126
//56 Merge Intervals

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        if (intervals.length == 1) return intervals;
//        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
        List<int[]> l = new ArrayList<>();
        int[] subArr = intervals[0];
        l.add(subArr);

        for (int[] oriSub : intervals) {
            if (oriSub[0] <= subArr[1]) subArr[1] = Math.max(subArr[1], oriSub[1]);
            else {
                subArr = oriSub;
                l.add(subArr);
            }
        }

//        for (int f : first) System.out.println(f);
//        System.out.println();
//        int p = 0, q = 0;
//        while (p < intervals.length && q < intervals.length) {
//            int left = Math.min(intervals[p][0], intervals[q][0]);
//            int right = Math.max(intervals[p][1], intervals[q][1]);
//            if (intervals[p][0] <= intervals[q][1] && intervals[p][1] >= intervals[q][0]) {
//                l.add(new int[] {left, right});
//                if (intervals[p][1] < intervals[q][1]) p++;
//                else if (intervals[p][1] > intervals[q][1]) q++;
//                else {
//                    p++;
//                    q++;
//                }
//            }
//            else {
//                if (intervals[p][1] <= intervals[q][1]) p++;
//                else q++;
//            }
//        }
        int[][] ans = new int[l.size()][2];
        for (int i = 0; i < l.size(); i ++) ans[i] = l.get(i);
        return ans;
    }

    public static void main(String[] args) {
        MergeIntervals mi = new MergeIntervals();
        int[][] nums = {{1, 4}, {2, 3}};
        int[][] ns = mi.merge(nums);
        for (int i = 0; i < ns.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ns[i][j] + " ");
            }
        }
    }
}
