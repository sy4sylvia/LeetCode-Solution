import javax.swing.text.html.StyleSheet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals[0]);
        List<int[]> l = new ArrayList<>();

        for (int i = 0; i < intervals.length - 1; i++) {
            int[] sub = new int[2];
            if (intervals[i][1]  >= intervals[i + 1][0]) {
                sub[0] = intervals[i][0];
                sub[1] = intervals[i + 1][1];
            }
            else {
                sub[0] = intervals[i][0];
                sub[1] = intervals[i][1];
            }
            l.add(sub);
        }

        System.out.println(l);

        int[][] ans = new int[l.size()][2];

        for (int i = 0; i < l.size(); i++) {
            ans[i] = l.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        MergeIntervals mi = new MergeIntervals();
        int[][] intervals = {{1, 3}, {4, 5}, {5, 6}};
        int[][] ans = mi.merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.println(ans[i][j]);
            }
        }
    }
}
