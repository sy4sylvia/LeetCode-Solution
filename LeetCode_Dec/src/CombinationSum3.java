//1229
//216 Combination Sum III

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        if (n < k * (k + 1) / 2) return new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            helperSum(k, n, 1, i, 0);
        }
        return res;
    }

    private void helperSum(int k, int n, int curIdx, int curN, int curSum) {
        if (curIdx > k) return;
        curSum += curN;
        if (curSum > n) return;

        path.add(curN);
        //n == target
        if (curIdx == k) {
            if (n == curSum) {
                List<Integer> subRes = new ArrayList<>(path);
                res.add(subRes);
            }
        }
        else {
            for (int nextN = curN + 1; nextN <= 9; nextN++) {
                helperSum(k, n, curIdx + 1, nextN, curSum);
            }
        }
        path.remove(path.size() - 1);
    }
}
