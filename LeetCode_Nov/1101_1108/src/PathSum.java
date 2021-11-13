//112 Path Sum
//1107

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    //DFS

    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> l = new ArrayList<>();
        helperSum(root, 0, l);
        for (int i = 0; i < l.size(); i++) {
            if (targetSum == l.get(i)) return true;
        }
        return false;
    }

    private void helperSum (TreeNode root, int path, List<Integer> l) {
        if (root != null) {
            path += root.val;
            if (root.left == null && root.right == null) l.add(path);
            if (root.left != null) helperSum(root.left, path, l);
            if (root.right != null) helperSum(root.right, path, l);
        }
    }
}
