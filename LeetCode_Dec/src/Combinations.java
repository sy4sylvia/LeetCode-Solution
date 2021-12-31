//1229
//77 Combinations

//1 <= n <= 20
//1 <= k <= n

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        for (int i = 1; i <= n - k + 1; i++) {
            helperCombine(n, k, i, 1, path);
        }
        return res;
    }

    private void helperCombine(int n, int k, int curN, int curK, List<Integer> path) {
        if (curK > k || curN > n) return;

        path.add(curN);

        if (curK == k) {
            List<Integer> subRes = new ArrayList<>(path);
            res.add(subRes);
        }
        else {
            //nextN, nextK
            for (int nextN = curN + 1; nextN <= n - k + curK + 1; nextN++) {
                helperCombine(n, k, nextN, curK + 1, path);
            }
        }
        path.remove(path.size() - 1);
    }
}
