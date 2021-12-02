//113 Path Sum II
//1128
// The number of nodes in the tree is in the range [0, 5000].
import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helperDFS(root, targetSum, path, ans);
        return ans;
    }

    private void helperDFS(TreeNode root, int remainingSum, List<Integer> path, List<List<Integer>> ans) {
        if (root == null) return;
        if (root != null) {
            path.add(root.val);

            if (root.left == null && root.right == null) {
                if (remainingSum == root.val) {
                    ans.add(new ArrayList<>(path));
                    return;
                }
            }
            if (root.left != null) {
                helperDFS(root.left, remainingSum - root.val, path, ans);
                path.remove(path.size() - 1);
            }
            if (root.right != null) {
                helperDFS(root.right, remainingSum - root.val, path, ans);
                path.remove(path.size() - 1);
            }

        }
    }

}
