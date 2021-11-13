//113 Path Sum II
//1107

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSum2 {
    //DFS

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helpFindPath(root, targetSum, path, ans);
        return ans;
    }

    private void helpFindPath(TreeNode root, int targetSum, List<Integer> path, List<List<Integer>> l) {
        if (root != null) {
            path.add(root.val);
            if (root.left == null && root.right == null) {
                if (targetSum == root.val) l.add(new ArrayList<>(path));
                return;
            }
            if (root.left != null) {
                helpFindPath(root.left, targetSum - root.val, path, l);
                path.remove(path.size() - 1);
            }
            if (root.right != null) {
                helpFindPath(root.right, targetSum - root.val, path, l);
                path.remove(path.size() - 1);
            }
        }
    }
}
