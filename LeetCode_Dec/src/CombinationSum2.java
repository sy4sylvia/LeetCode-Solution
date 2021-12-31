//1230
//40 Combination Sum II

//duplicate elements, can be used only once

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        for (int i = 0; i < candidates.length; i++) {
            if (i == 0 || candidates[i] != candidates[i - 1]) helper(candidates, target, i, 0);
        }
        return res;
    }

    private void helper(int[] candidates, int target, int curIdx, int curSum) {

        curSum += candidates[curIdx];
        if (curSum > target) return;

        path.add(candidates[curIdx]);

        if (curSum == target) {
            res.add(new ArrayList<>(path));
        }
        else {
            for (int nextIdx = curIdx + 1; nextIdx < candidates.length; nextIdx++) {
                if (nextIdx == (curIdx + 1) || candidates[nextIdx] != candidates[nextIdx - 1]){
                    helper(candidates, target, nextIdx, curSum);
                }
            }
        }
        path.remove(path.size() - 1);
    }
}
