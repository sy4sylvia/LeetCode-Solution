//1230
//39 Combination Sum
//1 <= target <= 500
//unique elements, can be used multiple times

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        for (int i = 0; i < candidates.length; i++) {
            helper(candidates, i, 0, target);
        }
        return res;
    }

    private void helper(int[] candidates, int curN, int curSum, int target) {

        curSum += candidates[curN];
        if (curSum > target) return;

        path.add(candidates[curN]);

        if (curSum == target) {
            res.add(new ArrayList<>(path));
        }
        else {
            for (int nextN = curN; nextN < candidates.length; nextN++) {
                helper(candidates, nextN, curSum, target);
            }
        }
        path.remove(path.size() - 1);
    }
}
