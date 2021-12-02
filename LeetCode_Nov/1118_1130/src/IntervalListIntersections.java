//1124
//986 Interval List Intersections

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) return new int[][] {};
        List<int[]> l = new ArrayList<>();
        int pointer1 = 0, pointer2 = 0;
        while (pointer1 < firstList.length && pointer2 < secondList.length) {
            int leftBound = Math.max(secondList[pointer2][0], firstList[pointer1][0]);
            int rightBound = Math.min(secondList[pointer2][1], firstList[pointer1][1]);

            //current two lists have an interval
            if (firstList[pointer1][0] <= secondList[pointer2][1] && firstList[pointer1][1] >= secondList[pointer2][0]) {
                l.add(new int[] {leftBound, rightBound});
                if (secondList[pointer2][1] == firstList[pointer1][1]) {
                    pointer1++;
                    pointer2++;
                }
                else if (secondList[pointer2][1] < firstList[pointer1][1]) pointer2++;
                else pointer1++;
            }
            //no intervals, one with the smaller right Bound has to move to the right.
            else {
                if (firstList[pointer1][1] < secondList[pointer2][1]) pointer1++;
                else pointer2++;
            }
        }
        int[][] ans = new int[l.size()][2];
        for (int i = 0; i < l.size(); i++) ans[i] = l.get(i);
        return ans;
    }

    public static void main(String[] args) {
        IntervalListIntersections ili = new IntervalListIntersections();
        int[][] firstList = {{0, 2}, {22, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {10, 22},  {25, 26}};
        int[][] ans = ili.intervalIntersection(firstList, secondList);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
