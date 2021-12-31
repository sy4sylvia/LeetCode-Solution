//1219
//1200 Minimum Absolute Difference

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbDiff {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] < min) min = arr[i] - arr[i - 1];
        }
        int left = 0;
        while (left + 1 < arr.length) {
            List<Integer> subL = new ArrayList<>();
            if (arr[left + 1] - arr[left] == min) {
                subL.add(arr[left]);
                subL.add(arr[left + 1]);
                res.add(subL);
            }
            left += 1;
        }
        return res;
    }

    public static void main(String[] args) {
        MinAbDiff mad = new MinAbDiff();
        int[] num = {40,11,26,27,-20};
        System.out.println(mad.minimumAbsDifference(num));
    }
}
